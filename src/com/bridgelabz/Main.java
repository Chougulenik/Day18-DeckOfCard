package com.bridgelabz;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		DeckOfCard cards = new DeckOfCard();
		ArrayList<String> make = cards.deckOfCards();
		
		cards.deckOfCards();
		cards.noOfPlayers();
		cards.sequenceOfPlay(2);
		cards.shuffle(make);

	}

}
