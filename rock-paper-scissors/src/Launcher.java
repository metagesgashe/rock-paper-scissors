import java.util.Scanner;

public class Launcher {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String player1 = scan.nextLine();
		player1= player1.toLowerCase().trim();
		
		
		String player2 = scan.nextLine();
		player2 = player2.toLowerCase().trim();
		
		System.out.println(rps(player1, player2));
		
		
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
