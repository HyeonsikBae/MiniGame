package MiniGame;

import java.util.Scanner;
import java.util.Random;

public class UpdownGame {

	int randomTemp;
	int randomNum;
	
	public void randInput() {
		Scanner scanner = new Scanner(System.in);
		boolean check = true;
		String randomTempStr ="";
		while(check) {
			System.out.println("�� ������ ���� �������� �����ðڽ��ϱ�?");
			System.out.print(">>> ");
			randomTempStr = scanner.next();
			for(int i=0;i<randomTempStr.length();i++) {
				char c = randomTempStr.charAt(i);
				if(c>'9'||c<'0') {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					check = true;
					break;
				}
				else check = false;
			}
		}
		randomTemp = Integer.parseInt(randomTempStr);
	}
	public void random() {
		Random random = new Random();
		randomNum = random.nextInt(randomTemp)+1;
		System.out.print("randomNum : " + randomNum);
	}
	public void game() {
		Scanner scanner = new Scanner(System.in);
		int guess;
		for(int i=0;i<10;i++) {
			while(true) {
				System.out.print((i+1) + "��° �Է� : ");
				guess = scanner.nextInt();
				if(guess<1||guess>randomNum) System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				else break;
			}
			if(guess>randomNum) {
				System.out.println("DOWN");
			}
			else if(guess<randomNum) {
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
	public void Play() {
		do {
			randInput();
			random();
			game();
		}while(regame());
	}
}
