package com.bridgelabz;

import java.util.ArrayList;

public class DeckOfCard extends Players {

	public ArrayList<String> cardsDeck = new ArrayList<>();

	
	public ArrayList deckOfCards() {
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace"};
    
    int numOfCards = suits.length * ranks.length;
   
    System.out.println("\nNumber of cards in the deck is : " +numOfCards);
    
    // First we have to itterate for loop for ranks starting from index 0.
    for (int i = 0; i < ranks.length; i++) {

        for (int j = 0; j < suits.length; j++) {
            cardsDeck.add(ranks[i] + " " + suits[j]);
        }
    }
    return cardsDeck;
	}
	
	 public static void shuffle(ArrayList<String> cardsDeck) {
	        System.out.println("shuffling the cards before Distribution");
	        ArrayList<String> temp = new ArrayList<String>();
	        while (!cardsDeck.isEmpty()) {
	            int loc = (int) (Math.random() * cardsDeck.size());
	            temp.add(cardsDeck.get(loc));
	            cardsDeck.remove(loc);
	        }
	        cardsDeck = temp;
	        print(cardsDeck);
	 }
	 
	 public static void print(ArrayList<String> cardsDeck) {
	        System.out.println("Cards in Deck:");
	        for (String element : cardsDeck) {
	            System.out.print("\n" + element);
	        }
	 }       
	        
	
	

}
