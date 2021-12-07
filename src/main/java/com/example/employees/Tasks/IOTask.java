package com.example.employees.Tasks;

public class IOTask  implements  Runnable{

    @Override
    public void run() {
        System.out.println("Hello, I'm a new Task + " + Thread.currentThread().getName());
    }
}
