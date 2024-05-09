package com.desginpatterns;

public class SingletonThreadSafe {
    private static volatile SingletonThreadSafe instance;

    public String value;
    private SingletonThreadSafe(String value){
        this.value=value;
    }

    public static SingletonThreadSafe getInstance(String value){

        SingletonThreadSafe result = instance;
        if(result!=null){
            return result;
        }
        synchronized (SingletonNoThreadSafe.class){
            if(instance== null){
                instance = new SingletonThreadSafe(value);
            }
            return instance;
        }
    }
}
