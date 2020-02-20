package com.example.home;

public class Main {
    public static void main (String args[]){
        Thread thOne=new Thread(new HeatRoom(20000));
        Thread thTwo=new Thread(new HeatRoom(20000));
        Thread thThree=new Thread(new HeatRoom(20000));

        thOne.start();
        thTwo.start();
        thThree.start();
    }
}
