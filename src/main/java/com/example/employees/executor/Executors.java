package com.example.employees.executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;

@Configuration
public class Executors {

/*
        System.out.println("Core count: " + Runtime.getRuntime().availableProcessors());
		//ExecutorService service = Executors.newFixedThreadPool(coreCount); //with pool size
		//IntStream.range(0,100).forEach(x -> service.execute(new IOTask()));

		//ExecutorService service = Executors.newCachedThreadPool();
		//IntStream.range(0,100).forEach(x -> service.execute(new IOTask()));

		//For scheduling of tasks
		//ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10); //10 threads
		//scheduledExecutorService.schedule(new IOTask(), 10, TimeUnit.SECONDS);

		//Task to run every 10 seconds
		//scheduledExecutorService.scheduleAtFixedRate(new IOTask(), 15, 10, TimeUnit.SECONDS);

		//Task to run repeatedly 10 seconds after previous task completes
		//scheduledExecutorService.scheduleWithFixedDelay(new IOTask(), 15, 10, TimeUnit.SECONDS);

		//Single thread
		//We use this when we want to ensure that the tasks will be donde one after one (waiting for the last to end)
		/*ScheduledExecutorService scheduledExecutorService1 = Executors.newSingleThreadScheduledExecutor();
		IntStream.range(0,100).forEach(x -> scheduledExecutorService1.execute(new IOTask()));*/

}
