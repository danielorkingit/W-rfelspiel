public class Main{
	
	public static void main(String[] args) {
		
		Spieler[] spieler = {new Spieler("Martin"), new Spieler("Martina"), new Spieler("Martinius")};
		
		Spiel spiel = new Spiel(5,spieler);
		spiel.startGame();
		
	}
	
	
}