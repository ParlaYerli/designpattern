package com.example.designpattern.Singleton;

public class Singleton {
    private static Singleton singleton;

    private Singleton(){
    }

    public static Singleton getInstance(){
        if(singleton==null){
            singleton= new Singleton();
        }
        return singleton;
    }

    public void write(){
        System.out.println("Nesne emrinize amade ... ");
    }


}
