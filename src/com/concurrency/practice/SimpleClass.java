package com.concurrency.practice;

public class SimpleClass {
    public void method(String str){
        System.out.println("String method " + str);
    }
    public void method(Object object) {
        System.out.println("Object method " + object);
    }
    public static void main(String[] args) {
        SimpleClass instance = new SimpleClass();
        instance.method("Hello");
        instance.method(new String("World"));
        String str = new String("Mango");
        instance.method((Object)str);
        instance.method(null);
    }
    //String method Hello
    //Object method World
    //object method Mango
    //object method null
}

