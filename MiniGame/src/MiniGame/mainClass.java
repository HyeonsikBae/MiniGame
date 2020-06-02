package MiniGame;

import MiniGame.*;

public class mainClass {
	
	public static void main(String[] args) {
		
		int select=0;
		boolean finish = false;
		
		while(!finish) {
			select = SelectGame.selectGameMethod();
			switch(select) {
				case 0:
					System.out.println("Thank You!");
					finish = true;
					break;
				case 1: 
					BaseballGame baseballGame = new BaseballGame();
					baseballGame.Play();
					break;
				case 2:
					UpdownGame updownGame = new UpdownGame();
					updownGame.Play();
					break;
				case 3:
					DiceGame diceGame = new DiceGame();
					diceGame.Play();
					break;
			}
		}
	}	
}