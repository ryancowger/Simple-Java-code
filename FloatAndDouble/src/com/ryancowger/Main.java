package com.ryancowger;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes).
        int myIntValue = 5 / 2;
        // width of float = 32 (4bytes).
        Float myFloatValue = 5f / 3f;
        // width of double = 64  (8 bytes)
        double myDoubleValue = 5d/ 3d;

        System.out.println("myIntVal = " + myIntValue );
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue );

        //convert pounds to kiloGrams
        double pounds = 200d;
        double conversion = pounds * 0.45359237d;

        System.out.println("The Final number is = " +conversion);
        // 90.7185

    }
}
