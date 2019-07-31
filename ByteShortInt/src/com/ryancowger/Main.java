package com.ryancowger;

public class Main {

    public static void main(String[] args) {

        byte myByte = 120;
        short myFirstShort = 2;
        int myInt = 2000;

        long MyLong = 50000L + 10L * (myByte + myFirstShort + myInt);
        short shortTotal = (short) (1000 + 10 * (myByte + myFirstShort + myInt));
        System.out.println("long = " + MyLong);
        System.out.println("Short = " +  shortTotal);

    }
}
