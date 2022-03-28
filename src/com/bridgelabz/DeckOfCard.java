package com.bridgelabz;

public class DeckOfCard {

	private String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	private String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	int card = suits.length * ranks.length;
	
	String[] deckCard() {
		String[] deck = new String[this.card];
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				deck[suits.length * i + j] = ranks[i] + " of " + suits[j];
				System.out.println(deck[suits.length * i + j]);
			}
		}
		
		for (int i = 0; i < card; i++) {
			int r = i + (int) (Math.random() * (card - i));  //random card 
			//System.out.println(r);
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}
		return deck;
	}
	
	public static void main(String[] args) {
	    
		DeckOfCard cards = new DeckOfCard();
		cards.deckCard();

	}
	

}
