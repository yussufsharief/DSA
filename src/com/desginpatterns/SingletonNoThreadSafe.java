package com.desginpatterns;

public class SingletonNoThreadSafe {
    private static SingletonNoThreadSafe instance;
    public String value;

    private SingletonNoThreadSafe(String value){
        this.value=value;
    }

    public  static SingletonNoThreadSafe getInstance(String value){
        if(instance == null){
            instance = new SingletonNoThreadSafe(value);
        }
        return instance;
    }

}
