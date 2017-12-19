package com.nt.listener;

import java.util.Date;
import java.util.List;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class ExamResultJobListener implements JobExecutionListener{

	private long startTime, stopTime;
	
	public void beforeJob(JobExecution jobExecution) {
		startTime = System.currentTimeMillis();
		System.out.println("ExamResult Job started at :"+new Date());
	}
	

	public void afterJob(JobExecution jobExecution) {
		List<Throwable> exceptionList=null;
		stopTime = System.currentTimeMillis();
		System.out.println("ExamResult Job stoped at :"+new Date());
		System.out.println("Total time taken in millis :"+(stopTime-startTime));
		
		if(jobExecution.getStatus() == BatchStatus.COMPLETED){
			System.out.println("ExamResult job completed successfully");
		}
		else if(jobExecution.getStatus() == BatchStatus.FAILED){
			System.out.println("ExamResult job failed with following exceptions ");
			
			exceptionList= jobExecution.getAllFailureExceptions();
			for(Throwable th : exceptionList){
				System.err.println("exception :" +th.getLocalizedMessage());
			}
		}
	}
}
