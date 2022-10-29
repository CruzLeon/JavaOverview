package org.example.creationalPatterns.singleton;

public class SingletonClass {

    private SingletonClass(){};
    private final SingletonClass instance = new SingletonClass();

    public SingletonClass getInstance(){
        return instance;
    }
}

class SingletonTwoClass{
    private static SingletonTwoClass instance;
    private SingletonTwoClass(){};

    public SingletonTwoClass getInstance(){
        if(instance == null){
            synchronized (SingletonTwoClass.class){
                if(instance==null) instance = new SingletonTwoClass();
                return instance;
            }
        }
        return instance;
    }
}