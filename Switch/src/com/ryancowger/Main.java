package com.ryancowger;

public class Main {

    public static void main(String[] args) {
	    int switchValue = 3;

        switch(switchValue){
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");

            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("actually it was a " + switchValue);
                break;

                default:
                    System.out.println("was not one 1    or 2");
                    break;
        }
    }
}
