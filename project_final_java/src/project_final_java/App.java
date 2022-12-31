package project_final_java;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 Deck deck = new Deck();
 Player player1= new Player("first");
 Player player2= new Player("second");
 deck.shuffle();
 
 // method to make sure that each player draw each cards
 for (int i=0;i<52;i++ ) {
	 if (i%2==0) {
		 player1.draw(deck);
	 }else {
		 player2.draw(deck);
	 }
 }
 // method to let players play 26 games and compare the results
 
 for (int i=0; i<26; i++) {
	 
	 Card firstplayer=player1.flip();
	 System.out.println("firstplayerdrawed");
	 firstplayer.describe();
	 Card secondplayer=player2.flip();
	 System.out.println("secondplayerdrawed");
	 secondplayer.describe();
	 
	 if (firstplayer.getValue()> secondplayer.getValue()) {
		 
		  firstplayer.incrementScore();
		  System.out.println("Player1 wins");
		  System.out.printf("Player1 score is:%n ", player1.storedscore());
		  
	 }else if (firstplayer.getValue()< secondplayer.getValue()){
		 
		 secondplayer.incrementScore();
		 System.out.println("player2 wins");
		 System.out.printf("Player2 score is:%n ", player2.storedscore());
		 
	 }else {
		 System.out.println("It is a draw");
	 }
	 
	
	 
	 
 }
 // displaying final score of the players
 
 if ( player1.storedscore()> player2.storedscore()) {
	 System.out.printf("Player1 won the game",player2.storedscore());
	 
 }else if ( player1.storedscore() < player2.storedscore()) {
	 System.out.println("Player2 won the game");
	 
 }else {
	 
		 System.out.println("No one won the game");
	 
 }
 
	}

}
