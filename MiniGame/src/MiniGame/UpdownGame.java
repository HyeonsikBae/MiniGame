package MiniGame;

import java.util.Scanner;
import java.util.Random;

public class UpdownGame {

	public static void main() {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		boolean bool = true;
		String select;
		
		while(bool) {
			select = "";
			int rand = random.nextInt(100)+1;
			
			for(int i=0;i<10;i++) {
				int guess = 0;
				while(guess<1||guess>100) {
					System.out.print((i+1) + "번째 입력 : ");
					guess = scanner.nextInt();
					if(guess>=1&&guess<=100) {
						continue;
					}
					System.out.println("ERROR");
				}
					
				if(guess>rand) {
					System.out.println("DOWN");
				}
				else if(guess<rand) {
					System.out.println("UP");
				}
				else {
					System.out.println("CLEAR ^~^ b");
					break;
				}
				if(i==9) {
					System.out.println("fail...");
				}
			}
			
			while(!select.equals("Y")&&!select.equals("N")) {
				System.out.print("Do you want replay?? Y/N");
				select = scanner.next();
				if(select.equals("Y")) {
					bool = true;
				}
				else if(select.equals("N")) {
					bool = false;
				}
				else {
					System.out.println("ERROR!!");
				}
			}	
		}
	System.out.println("Finish the Updown Game");
	}
}
