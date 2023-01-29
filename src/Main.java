public class Main{
	
	public static void main(String[] args) {
		
		Spieler[] x = {new Spieler("Daniel"), new Spieler("hej")};
		
		Spiel spiel = new Spiel(5, x);
		spiel.startGame();
		
	}
	
	
}