package com.microsoft.demo;

public class Demo {

    public static void main(String arg[]){
        System.out.println("This runs in the test branch......");
    }
    
    public void DoSomething(boolean flag){
        if(flag){
            System.out.println("I am covered");
            return;
        }

        System.out.println("I am not covered");
    }
}