package com.chainway.queryhbase.task;

import org.springframework.scheduling.annotation.Scheduled;

public class QueryHbaseTask {

	@Scheduled(cron = "0/5 * * * * ?")
	public void queryHbase(){
		System.out.println("hello world");
	}
}
