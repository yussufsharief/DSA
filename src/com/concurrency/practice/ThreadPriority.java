package com.concurrency.practice;

public class ThreadPriority {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());

        Thread t1= new Thread(new EmailCampaign());
        Thread t2 = new Thread(new DataAggregator());
        t1.setName("Email");
        t2.setName("DataA");


        t1.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();

        try {
            //t2.join();
            t2.join(3);//Waits at most millis milliseconds for this thread to die. A timeout of 0 means to wait forever
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Inside main");

    }

    static class EmailCampaign implements Runnable{

        @Override
        public void run() {
for(int i=0;i<10;i++){
    System.out.println(Thread.currentThread().getName());
    if(i==5){
        Thread.currentThread().yield(); //Hint to Scheduler that thread is willing to
                                        //yield its current use of CPU
    }
}
        }
    }

    static class DataAggregator implements Runnable{

        @Override
        public void run() {

            for(int i=0;i<10;i++){
                System.out.println(Thread.currentThread().getName());
            }
        }
    }
}
