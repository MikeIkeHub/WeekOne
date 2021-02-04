package com.weekone;

public class Friends {

	public static void main(String[] args) {
		
		double itemA = 19.99; //Item prices
		int itemB = 3;
		
		int walletA = 50; // Amount of money in wallets
		double walletB = 76.54;
		
		double friendsA = 10; //Number of friends
		double friendsB = 6;
		
		int ageA = 34; //Age in years (as a whole number)
		int ageB = 23;
		
		String firstNameA = "Kacey"; //First names
		String firstNameB = "Lyon";
		
		String lastNameA = "Lent"; //Last names
		String lastNameB = "Heart";
		
		char middleA = 'P'; //Middle initials
		char middleB = 'T';
		
		System.out.println("Item A: " + itemA + "$");
		System.out.println("Item B: " + itemB + "$");
		System.out.println("Amount in wallet A: " + walletA + "$");
		System.out.println("Amount in wallet B: " + walletB + "$");
		System.out.println("Amount of friends for A: " + friendsA);
		System.out.println("Amount of friends for B: " + friendsB);
		System.out.println("Age of A: " + ageA);
		System.out.println("Age of B: " + ageB);
		System.out.println("First Name of A: " + firstNameA);
		System.out.println("First Name of B: " + firstNameB);
		System.out.println("Last Name of A: " + lastNameA);
		System.out.println("Last Name of B: " + lastNameB);
		System.out.println("Middle Initial of A: " + middleA);
		System.out.println("Middle Initial of B: " + middleB);
		
		double newWalletA = (walletA - itemA); //item purchased with wallet
		double newWalletB = (walletB - itemB);
		
		double friendsPYA = (friendsA/ageA); //number of friends made per year from birth
		double friendsPYB = (friendsB/ageB);
		
		System.out.println(newWalletA + "$ left in " + firstNameA + "'s wallet after purchase of item A.");
		System.out.println(newWalletB + "$ left in " + firstNameB +"'s wallet after purchase of item B.");
		System.out.println(firstNameA + ": Friends made per year is " + friendsPYA);
		System.out.println(firstNameB + ": Friends made per year is " + friendsPYB);
		System.out.println("Full Name: " + firstNameA + " " + middleA + " " + lastNameA);
		System.out.println("Full Name: " + firstNameB + " " + middleB + " " + lastNameB);
	}

}
