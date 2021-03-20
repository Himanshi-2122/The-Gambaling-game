// Name: Himanshy Kapoor
// Student ID: 201904058
// Date Submitted: March 17th, 2021
// Class IN2203  G1
// Name of work: Assignment 1: The Gambling Game


import java.util.Scanner;
import java.util.Random;

public class Main 
{
	
	// Initiating scanner to take inputs
	Scanner inp = new Scanner(System.in);	// Called the scanner class
	
	// Casino class
	public void GameInit()
	{
		Random randomInt = new Random();		// Called the Random class
		
		// declaring variables for the game
		int UserNum;
		int min = 1;
		int max = 100;
		int CompNum;
		String Cont = "";
		
		System.out.print("============================");
		System.out.print("Your Game has been started");
		System.out.print("============================\n");
		System.out.println("You have to guess a number between 1 to 100");
		System.out.print("Choose number: ");
		UserNum = inp.nextInt();
		System.out.println("Computer will guess a number now");
		CompNum = min + randomInt.nextInt(max);

		if(UserNum > 100)
		{
			System.out.println("You can't choose any number after 100");
			System.exit(-1);
		}
		else
		{
			System.out.println("Your Number: " + UserNum);
			System.out.println("Computer's Number " + CompNum);
			
			if(UserNum > CompNum)
			{
				System.out.println("Congratulations!!\nYour Number is greater than computer's number Therefore, you won!!");
				System.out.print("\n\nWould you like to play again? Reply with Yes or No: ");
				
				if(Cont.equals("Yes"))
				{
					GameInit();
				}
				else if(Cont.equals("No"))
				{
					System.exit(-1);
				}
				else
				{
					System.out.println("Wrong Choice!!");
				}
			}
			else
				System.out.println("Your Number is Lesser than the Computer's number so, the computer won!!\nBetter luck next time!");
		}	
	}
	
	// Player class
	public void Player()
	{
		// declaring some variables
		String username;
		String choice;
		
		//Taking user's input and then generating computer's number then displaying the result.
		System.out.print("Please enter your name: ");
		username = inp.nextLine();
		System.out.print("Hello " + username + ", You are invited to play a game, Reply with 'Yes' to start and 'No' to Exit.\nYour Choice: ");
		choice = inp.next();
		if(choice.equals("Yes"))
		{
			Main GameStart = new Main();
			GameStart.GameInit();
		}
		else if(choice.equals("No"))
		{
			System.out.println("Your choice was No so this game will be end here, you can start it again!");
		}
		else
		{
			System.out.println("Wrong Choice!");
		}
	}
	
	// Game class
	public void gameMenu()
	{
		String line = "==================================";
		System.out.println(line + "\nWelcome to the Gambling Game\n" + line);
		System.out.println("First of all, let's start by answering some questions:\n");
		
		//Calling Player Class through object creation
		Main PlayerPortal = new Main();
		PlayerPortal.Player();
	}
	public static void main(String[] args) 
	{
		Main Game = new Main();
		
		// Starting the game
		Game.gameMenu();
		
	}
}
