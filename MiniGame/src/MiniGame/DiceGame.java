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
			System.out.print("������ ���� �� �Է� : ");
			bat = scanner.nextInt();
			if(bat>MAX_COIN || bat<0) System.out.println("���� ������ 20�� �Դϴ�.");
			else break;
		}
	}
	public void dice() {
		Scanner scanner = new Scanner(System.in);
		while(true) {	
			System.out.print("���� �ֻ��� �� �Է� : ");
			dice = scanner.nextInt();
			if(dice > MAX || dice < MIN)	System.out.println("2~12 ���̷θ� �Է��ϼ���");
			else if(dice == MIN || dice == MAX)	System.out.println("���� �Ұ�");
			else break;
		}
	}
	public int random() {
		Random random = new Random();
		int randomDice = random.nextInt(MAX-1)+2;
		System.out.println("�ֻ��� ��� : " + randomDice);
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
			System.out.println("��!");
		else {
			switch(randomDice) {
				case 3:
					System.out.println("18�� ��÷\n��÷�� : " + bat*18);
					break;
				case 4:
					System.out.println("12�� ��÷\n��÷�� : " + bat*12);
					break;
				case 5:
					System.out.println("9�� ��÷\n��÷�� : " + bat*9);
					break;
				case 6:
					System.out.println("7�� ��÷\n��÷�� : " + bat*7);
					break;
				case 7:
					System.out.println("6�� ��÷\n��÷�� : " + bat*6);
					break;
				case 8:
					System.out.println("7�� ��÷\n��÷�� : " + bat*7);
					break;
				case 9:
					System.out.println("9�� ��÷\n��÷�� : " + bat*9);
					break;
				case 10:
					System.out.println("12�� ��÷\n��÷�� : " + bat*12);
					break;
				case 11:
					System.out.println("18�� ��÷\n��÷�� : " + bat*18);
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
			System.out.print("�� ������ �Ͻðڽ��ϱ�? Y/N");
			select = scanner.next();
			if(select.equals("Y")) {
				bool = true;
			}
			else if(select.equals("N")) {
				System.out.println("����");
				bool = false;
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		return bool;
	}
}
