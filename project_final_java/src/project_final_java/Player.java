package project_final_java;

import java.util.ArrayList;
import java.util.List;

public class Player {
// method that allow players to pick a card	
private List<Card> hand=new ArrayList<Card>();

private int score;
private String name;


public Player(String newname) {
	name=newname;
	score=0;
}
public void describe() {
	
System.out.printf("the first play has these cards:\n", name);

for (Card card: hand) {
	card.describe();
}
}
// method to flip a card
public Card flip() {
	return hand.remove(0);
}
public void draw (Deck deck) {
	hand.add(deck.draw());
}
// method to increase score of a winner
public void incrementScore() {
	score=score+1;
	
}
//method to keep score of each round
public int storedscore() {
	return score;
}
}