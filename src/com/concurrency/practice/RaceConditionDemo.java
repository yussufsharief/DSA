package com.concurrency.practice;

public class RaceConditionDemo {
    public static void main(String[] args) {
        BankAccount task = new BankAccount();
        task.setBalance(100);
        Thread jhon = new Thread(task);
        Thread anita = new Thread(task);

        jhon.setName("john");
        anita.setName("anita");
        jhon.start();
        anita.start();

        System.out.println("balance---"+task.getBalance());
    }
}

class BankAccount implements Runnable{
private int balance;
public  void setBalance(int balance){
    this.balance= balance;
}
public synchronized int getBalance(){
    return balance;
}
    @Override
    public void run() {
        makeWithdrawl(75);
        if(balance<0){
            System.out.println("money over drawn");
        }
    }

    private synchronized void makeWithdrawl(int amount){
    if(balance>=amount){
        System.out.println(Thread.currentThread().getName()+"is about to withdrwam the "+amount);
        balance-=amount;
        System.out.println(Thread.currentThread().getName()+" has withdraw the "+amount);
    } else {
        System.out.println("Sorry not enough money  "+Thread.currentThread().getName());
    }
    }
}
