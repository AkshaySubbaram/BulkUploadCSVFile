package com.example.batch.load;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.batch.core.Job;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoadApplication implements CommandLineRunner {

	@Autowired
	private final JobLauncher jobLauncher;

	@Autowired
	private final Job importSkillsJob;

	public LoadApplication(JobLauncher jobLauncher, Job importSkillsJob) {
		this.jobLauncher = jobLauncher;
		this.importSkillsJob = importSkillsJob;
	}

	public static void main(String[] args) {
		SpringApplication.run(LoadApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		JobParameters jobParameters = new JobParametersBuilder()
				.addLong("time", System.currentTimeMillis())
				.toJobParameters();
		JobExecution execution = jobLauncher.run(importSkillsJob, jobParameters);
		System.out.println("Job Status: " + execution.getStatus());
	}
}
