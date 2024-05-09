package com.concurrency.practice;

import java.util.concurrent.TimeUnit;

public class MyFirstThreadRunnable {
    public static void main(String[] args) {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();
        try {
            //Thread.sleep(3000); //main thread will sleep for 3 seconds
            TimeUnit.SECONDS.sleep(3);//main thread will for 3 seconds
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Inside main...");
    }
}

class Task implements  Runnable{

    @Override
    public void run() {
        System.out.println("Inside run..");
        go();
    }

    private void go(){
        System.out.println("Inside goo...");
        more();

    }

    private void more(){
        System.out.println("Inside more...");
    }
}