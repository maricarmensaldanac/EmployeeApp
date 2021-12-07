package com.example.employees.threads;

public class HelloThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello, I'm the runnable");
    }
}
