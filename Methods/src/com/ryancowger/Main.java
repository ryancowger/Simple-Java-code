package com.ryancowger;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is " +highScore);
        calculateScore(gameOver, score, levelCompleted, bonus);


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is " +highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Ryan", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("james ", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("jeff", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("kyle", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Carol", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Lindsey", highScorePosition);


    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName+ " managed to get position "
                + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if(playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500){
//            return 2;
//        }else if(playerScore >= 100){
//            return 3;
//        }
//            return 4;

        int position = 4; // assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }


        public static int calculateScore ( boolean gameOver, int score, int levelCompleted, int bonus){


            if (gameOver) {
                int finalScore = score + (levelCompleted * bonus);
                finalScore += 2000;

                return finalScore;
            } else {

                return -1;

            }


        }


    }
