package com.ryancowger;

public class Main {

    public static void main(String[] args) {
	        boolean gameOver = true;
	        int score = 800;
	        int levelCompleted = 5;
	        int bonus = 100;

//	        if(score < 500 && score > 1000){
//	        	System.out.println("Your score was less than 5000 but greater than 100");
//	        }else if(score < 1000){
//			System.out.println("Your score was less than 1000");
//	        } else{
//				System.out.println("Got this");
//			}
		if(gameOver == true){
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 100;
			System.out.println("Your final score was " + finalScore);
		}



		score = 10000;
		levelCompleted = 8;
		bonus = 200;

		if(gameOver == true){
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}





    }
}
