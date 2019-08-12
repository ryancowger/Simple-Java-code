package com.ryancowger;

public class Main {

    public static void main(String[] args) {
	   int newScore = calculateScore("Ryan", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(6, 0);

        calcFeetAndInchesToCentimeters(156);
    }



    public static int calculateScore(String playerName, int score){
        System.out.println("player " + playerName + " Scored " + score + " points");
        return score * 1000;
    }
    //Overloading the method

    public static int calculateScore(int score) {
        System.out.println("Unnamed player Scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No Player name, no player." );
        return 0;
    }
        //converting feet and inches to CM
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if((feet < 0) || ((inches < 0) || (inches > 12))){
            System.out.println("invalid feet or inch");
            return -1;
        }

        double centimeters = (feet * 12) * 2.14;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + "inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
