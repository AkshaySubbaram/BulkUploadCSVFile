package com.example.batch.load.config;

import com.example.batch.load.entity.TnSkillUploadDetails;
import com.example.batch.load.listener.JobCompletionNotificationListener;
import com.example.batch.load.reader.ExcelItemReader;
import com.example.batch.load.row.mapper.SkillStepListener;
import com.example.batch.load.writer.SkillItemWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.*;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableBatchProcessing
public class BatchConfig {

    private static final Logger logger = LoggerFactory.getLogger(BatchConfig.class);

    @Bean
    public Job importSkillsJob(JobRepository jobRepository,
                               Step skillLoadStep,
                               JobCompletionNotificationListener listener) {
        logger.info("importSkillsJob----------------");
        return new JobBuilder("importSkillsJob", jobRepository)
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .start(skillLoadStep)
                .build();
    }

    @Bean
    public Step skillLoadStep(JobRepository jobRepository,
                              PlatformTransactionManager transactionManager,
                              ExcelItemReader reader,
                              SkillItemWriter writer,
                              SkillStepListener listener) {
        logger.info("skillLoadStep::::::::::::");
        return new StepBuilder("skillLoadStep", jobRepository)
                .<TnSkillUploadDetails, TnSkillUploadDetails>chunk(10, transactionManager)
                .reader(reader)
                .writer(writer)
                .listener(listener)
                .faultTolerant()
                .skipLimit(100)
                .skip(Exception.class)
                .build();
    }

}

