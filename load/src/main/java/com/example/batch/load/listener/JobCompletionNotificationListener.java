package com.example.batch.load.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

@Component
public class JobCompletionNotificationListener implements JobExecutionListener {

    private static final Logger logger = LoggerFactory.getLogger(JobCompletionNotificationListener.class);

    @Override
    public void beforeJob(JobExecution jobExecution) {
        logger.info("!!! JOB STARTED: {} (ID: {}) !!!",
                jobExecution.getJobInstance().getJobName(),
                jobExecution.getJobId());
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
            logger.info("!!! JOB FINISHED SUCCESSFULLY !!!");
            jobExecution.getStepExecutions().forEach(step -> {
                logger.info("Step '{}' processed {} items (Read: {}, Skipped: {})",
                        step.getStepName(),
                        step.getWriteCount(),
                        step.getReadCount(),
                        step.getSkipCount());
            });
        } else {
            logger.error("!!! JOB FAILED (Status: {}) !!!", jobExecution.getStatus());
            jobExecution.getAllFailureExceptions().forEach(ex ->
                    logger.error("Failure reason: {}", ex.getMessage()));
        }
    }
}
