package com.example.home;

import java.math.BigInteger;

public class HeatRoom implements Runnable {
    private int number;
        public HeatRoom(int number) {
            super();
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    private BigInteger startHeating (int number) {
        BigInteger warm = new BigInteger("1");
        for (int i = 2; i < number; i += 1) {
            warm = warm.multiply(new BigInteger("" + i));
        }
            return warm;
        }
        @Override
                public void run() {
            Thread th = Thread.currentThread();
            for (int i = 1; i<=this.number;i++) {
                System.out.println(th.getName()+""+"!="+i+"="+startHeating(i));
            }
        }
    }


