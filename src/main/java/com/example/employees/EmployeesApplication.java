package com.example.employees;

import com.example.employees.Tasks.IOTask;
import com.zaxxer.hikari.util.ClockSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

@SpringBootApplication
public class EmployeesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeesApplication.class, args);

		ScheduledExecutorService scheduledExecutorService1 = Executors.newSingleThreadScheduledExecutor();
		IntStream.range(0,100).forEach(x -> scheduledExecutorService1.execute(new IOTask()));

		ExecutorService service = Executors.newCachedThreadPool();
		IntStream.range(0,100).forEach(x -> service.execute(new IOTask()));
	}
}