package MiniGame;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	private final int MAX_COIN = 20;
	private final int MAX = 12;
	private final int MIN = 2;
	int bat;
	int dice;
	
	public void bat() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("배팅할 코인 수 입력 : ");
			bat = scanner.nextInt();
			if(bat>MAX_COIN || bat<0) System.out.println("보유 코인은 20개 입니다.");
			else break;
		}
	}
	public void dice() {
		Scanner scanner = new Scanner(System.in);
		while(true) {	
			System.out.print("예측 주사위 값 입력 : ");
			dice = scanner.nextInt();
			if(dice > MAX || dice < MIN)	System.out.println("2~12 사이로만 입력하세요");
			else if(dice == MIN || dice == MAX)	System.out.println("제시 불가");
			else break;
		}
	}
	public int random() {
		Random random = new Random();
		int randomDice = random.nextInt(MAX-1)+2;
		System.out.println("주사위 결과 : " + randomDice);
		return randomDice;
	}
	public void Play() {
		do{
			bat();
			dice();
			result(random());
		}while(regame());
	}
	public void result(int randomDice) {
		if(randomDice != dice || randomDice == 2 || randomDice == 12) 
			System.out.println("꽝!");
		else {
			switch(randomDice) {
				case 3:
					System.out.println("18배 당첨\n당첨금 : " + bat*18);
					break;
				case 4:
					System.out.println("12배 당첨\n당첨금 : " + bat*12);
					break;
				case 5:
					System.out.println("9배 당첨\n당첨금 : " + bat*9);
					break;
				case 6:
					System.out.println("7배 당첨\n당첨금 : " + bat*7);
					break;
				case 7:
					System.out.println("6배 당첨\n당첨금 : " + bat*6);
					break;
				case 8:
					System.out.println("7배 당첨\n당첨금 : " + bat*7);
					break;
				case 9:
					System.out.println("9배 당첨\n당첨금 : " + bat*9);
					break;
				case 10:
					System.out.println("12배 당첨\n당첨금 : " + bat*12);
					break;
				case 11:
					System.out.println("18배 당첨\n당첨금 : " + bat*18);
					break;
			}
		}
	}
	public boolean regame() {
		Scanner scanner = new Scanner(System.in);
		boolean bool = true;
		String select="";
		while(!select.equals("Y")&&!select.equals("N")) {
			select = "";
			System.out.print("새 게임을 하시겠습니까? Y/N");
			select = scanner.next();
			if(select.equals("Y")) {
				bool = true;
			}
			else if(select.equals("N")) {
				System.out.println("종료");
				bool = false;
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		return bool;
	}
}
