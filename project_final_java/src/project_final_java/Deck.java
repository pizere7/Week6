package project_final_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
// list that will hold a card a player will have
	List<Card> cards=new ArrayList<Card>();
	// listing card numbers 
	List<Integer> cardValues=Arrays.asList(2,3,4,5,6,7,8,9,10,11,12,13,14);
	//listing card suits
	List<String> suits= Arrays.asList("Hearts","Diamonds","Spades","Clubs");
	// a method that will match each card number to their suits
 public Deck() {
	 
	 for (Integer cardValue: cardValues) {
		 
		 for(String suit: suits) {
			 
			String cardname="";
			switch(cardValue){
				case 2:
					cardname="2 of "+suit;
				break;
				case 3:
					cardname="3 of "+suit;
				break;
				case 4:
					cardname="4 of "+suit;
				break;
				case 5:
					cardname="5 of "+suit;
				break;
				case 6:
					cardname="6 of "+suit;
				break;
				case 7:
					cardname="7 of "+suit;
				break;
				case 8:
					cardname="8 of "+suit;
				break;
				case 9:
					cardname="9 of "+suit;
				break;
				case 10:
					cardname="10 of "+suit;
				break;
				case 11:
					cardname="11 of "+suit;
				break;
				case 12:
					cardname="12 of "+suit;
				break;
				case 13:
					cardname="13 of "+suit;
				break;
				case 14:
					cardname="14 of "+suit;
				break;
			}
			// adding each card to the card list
				cards.add(new Card(cardValue, cardname));

		 }
	 }
	
 }
 // this where all the shuffling will happen
public void shuffle() {
	Collections.shuffle(cards);
}
// a method to draw a card
public Card draw () {
	return cards.remove(0);
	
}
}