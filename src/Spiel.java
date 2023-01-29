import java.util.Random;
import java.util.Scanner;

public class Spiel {
	
	int rounds;
	Spieler[] spieler;
	Random random;
	Scanner sc;
	boolean done;
	int crounds;
	
	{
		sc = new Scanner(System.in);
		done = false;
		random = new Random();
		crounds = 0;
	}
	
	public Spiel(int rounds, Spieler[] spieler) {
		
		this.rounds = rounds;
		this.spieler = spieler;
		
	}
	
	public void startGame() {
		
		for (int i = 0; i < rounds ; i++) {
			
			for (Spieler s : spieler) {
				
				if(makeMove(s) == 1) {
					System.out.println(s.name + " won.");
					done = true;
					break;
				}
				
				System.out.println(s.name + " " + s.punkte + " " + s.gewertet);
				
			}
			crounds += 1;
			if (done) break;
		}
		
		System.out.println("done");
		
	}
	
	public int makeMove(Spieler s) {
		
		int x = random.nextInt(6) + 1;
		
		System.out.println(s.name + " hat " + x + " gewürfelt. Zählen lassen ?");
		
		int input = Integer.valueOf(sc.nextLine());
		
		// 15 - 3 = 12 
		
		if (input == 1 || rounds-crounds <= 4-s.gewertet) {
			s.gewertet += 1;
			s.punkte += x;
		} 
		
		if(s.punkte == 2 && s.gewertet == 4) {
			return 1;
		} else {
			return 0;
		}
	}
	
}
