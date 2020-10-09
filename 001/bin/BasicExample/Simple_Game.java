import java.util.Scanner;
// add timer, current score&life, plus time when correct, hard mode
public class Simple_Game {
	static int life = 3;
	static int score = 0;
	static int userinput = 0;
	public static void main(String[] args) {
		
		int a, b;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
		System.out.println("1. Play the game\n2. How to play this game\n3. Exit");
		userinput = scanner.nextInt();
		
		switch (userinput) {
		case 1:
			while (life > 0) {
				a = (int) (Math.random() * 10 +1);
				b = (int) (Math.random() * 10 +1);
				
				System.out.print(a+" * "+b+" = ? : ");
				userinput = scanner.nextInt();
				
				if (userinput == a*b) {
					score++;
					continue;
				}
				else {
					System.out.println("life -1");
					life--;
				}
			}
			System.out.println("\nYour Score : "+score);
			break;
			
		case 2:
			System.out.println("Write Correct answer of the Operation\n");
			continue;
			
		case 3:
			 System.exit(0);
			 break;
			 
		default:
			break;
		}		
		System.out.println("Game Over\n");
	}
		
}
	}
