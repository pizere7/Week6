package project_final_java;

public class Card {
private int value;
private String name;
private int score=0;



public Card(int cardValue, String cardname) {
	this.value=cardValue;
	this.name=cardname;
}
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
// method that describe a card a play picked
public void describe() {
	System.out.println("the name of a card you picked is:"+name);
	
}
public Card(String newname) {
	name=newname;
	score=1;
}
public void incrementScore() {
	// TODO Auto-generated method stub
	 score=score+1;
}
public int storedscore() {
	return score;
}
}

