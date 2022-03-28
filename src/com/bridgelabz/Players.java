package com.bridgelabz;

import java.util.Scanner;

public class Players {

	 public void noOfPlayers() {
	        
		 System.out.print("\nEnter number of players minimum 2 , maximum 4 : ");
	     Scanner sc = new Scanner(System.in);
	     int player = sc.nextInt();
	        
	     if (player >= 2 && player <= 4) {   
	    	 System.out.println("\n" + player + " players will play the game");    
	     }
	     else {  
	    	 System.out.println("Please enter number of players in the Range");  
	    	 noOfPlayers();   
	     }     
	  }
	 
	 public static void sequenceOfPlay(int player) {
		 
		 for (int i = 1; i <= player; i++) {
			 System.out.println("Player " + i + " Getting card:");
	     }
	 }       
}
