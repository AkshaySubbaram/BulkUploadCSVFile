package com.example.batch.load.row.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.stereotype.Component;


@Component
public class SkillStepListener implements StepExecutionListener {
    private static final Logger logger = LoggerFactory.getLogger(SkillStepListener.class);

    @Override
    public void beforeStep(StepExecution stepExecution) {
        logger.info("Step initialized - chunkSize={}",
                stepExecution.getJobParameters().getLong("chunk.size"));
    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        logger.info("Step completed - ReadCount={}, WriteCount={}, FilterCount={}, SkipCount={}",
                stepExecution.getReadCount(),
                stepExecution.getWriteCount(),
                stepExecution.getFilterCount(),
                stepExecution.getSkipCount());

        return null;
    }
}
