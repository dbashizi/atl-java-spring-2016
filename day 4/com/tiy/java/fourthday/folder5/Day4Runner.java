package com.tiy.java.fourthday.folder5; 

import java.util.Scanner; 

public class Day4Runner {

	public static void main(String[] args) {
		System.out.println("Running Day4Runner.main() ..."); 

		int numberOfGamesWon = 0; 

		for (int counter = 0; counter < 4; counter++) {
			boolean didIWin = startGame(); 
			if (didIWin) { 
				numberOfGamesWon = numberOfGamesWon + 1; 
			}
		}

		System.out.println("You have won " + numberOfGamesWon + " games"); 

		System.out.println("Done for the day! Goodbye!");
	}

	public static boolean startGame() { 
		System.out.println("In startGame()"); 

		boolean gameWon = false; 

		Scanner lineScanner = new Scanner(System.in); 
		String userNumber = lineScanner.nextLine(); 
		System.out.println("User entered the following number: " + userNumber);

		double computerNumber = getRandomNumber(); 
		System.out.println("Computer number = " + computerNumber); 

		double userNumberAsADouble = Double.parseDouble(userNumber);
		System.out.println("Converted user number as double is " + userNumberAsADouble);

		if (userNumberAsADouble < computerNumber) { 
			System.out.println("You won!"); 
			gameWon = true; 
		} else { 
			System.out.println("You lost :-(");
			gameWon = false; 
		}

		System.out.println("Done with startGame()"); 
		return gameWon; 
	}

	public static double getRandomNumber() { 
		System.out.println("In getRandomNumber()"); 
		
		double randomNumber = Math.random(); 
		System.out.println("Original random number = " + randomNumber); 
		randomNumber = randomNumber * 100; 
		System.out.println("Modified random number = " + randomNumber);

		System.out.println("Done with getRandomNumber()"); 
		return randomNumber; 
	}

}