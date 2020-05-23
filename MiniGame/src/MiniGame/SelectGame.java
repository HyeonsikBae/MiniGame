package MiniGame;
import java.util.Scanner;

public class SelectGame {
	
	public static final int countGame = 2;//Number Of Game
	public static int selectGameMethod() {
		
		Scanner scanner = new Scanner(System.in);
		int selectGame = 0;
		boolean checkGame = false;
		
		while(!checkGame) {
			System.out.println("Select game number for playing (Exit : 0)");
			System.out.println("1. Baseball Game" + "\n" + 
							   "2. UpDown Game" + "\n");
			System.out.print("Input : ");
			selectGame = scanner.nextInt();
		
			if(selectGame < 0 || selectGame > countGame) {
				System.out.println("ERROR!!");
				checkGame = false;
			}
			else if(selectGame == 0){
				checkGame = true;
			}
			else {
				checkGame = true;
			}
		}
		
		return selectGame;
	}
}