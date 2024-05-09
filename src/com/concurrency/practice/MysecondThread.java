package com.concurrency.practice;

public class MysecondThread extends Thread{

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
    public static void main(String[] args) {
        Thread thread = new MysecondThread();
        thread.start();
        System.out.println("Inside main...");
    }
}
