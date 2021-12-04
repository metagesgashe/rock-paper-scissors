import java.util.Scanner;

public class Launcher {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean play = true;
		while(play) {
			System.out.println("Welcome to the rock-paper-scissors game");
			System.out.println("please choose *rock*, *paper* or *scissors*");
			
			String player1 = scan.nextLine();
			player1= player1.toLowerCase().trim();
			System.out.println("player 1: " + player1);
			
			
			String player2 = scan.nextLine();
			player2 = player2.toLowerCase().trim();
			System.out.println("player 2: " + player2);
			System.out.println();
			
			System.out.println(rps(player1, player2));
			
			System.out.println();
			System.out.println("Do you want to play more? (please say *yes* or *no*)");
			String answer = scan.nextLine(); 
			
			answer = answer.toLowerCase().trim();
			
			if (answer.equals("yes")) {
				play = true;
			} else if (answer.equals("no")) {
				System.out.println("Thank you for playing!");
				play = false;
			} else {
				System.out.println("please say yes or no");
				System.out.println("Thank you for playing!");
				play = false;
			}
		}
		
		
		
		scan.close();
	}
	
	public static String rps(String player1, String player2) {
		
		
		if (player1.equals("rock") && player2.equals("paper")) {
			return "player 2 wins";
		} else if (player1.equals("rock") && player2.equals("scissors")) {
			return "player 1 wins";
		}else if (player1.equals("paper") && player2.equals("scissors")) {
			return "player 2 wins";
		} else if (player1.equals("paper") && player2.equals("rock")) {
			return "player 1 wins";
		} else if (player1.equals("scissors") && player2.equals("paper")) {
			return "player 1 wins";
		} else if (player1.equals("scissors") && player2.equals("rock")) {
			return "player 2 wins";
		} else if (player1.equals(player2)) {
				return "TIE";
		} else {
			return "Something went wrong";
		}
	}

}
