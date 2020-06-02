package MiniGame;

import java.util.Random;
import java.util.Scanner;

public class BaseballGame {

	int guess[] = new int[3];
	int random[] = new int[3];
	int count;
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
	public void count() {
		String numStr = "";
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("1���� �� ������ ������ �Է� : ");
			numStr = scanner.next();
			char c=' ';
			for (int i = 0; i < numStr.length(); i++) {
				c = numStr.charAt(i);
				if(c>'9'||c<'0'||(numStr.length()==1&&c=='1'||c=='2')) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					c = ' ';
					break;
				}
			}
			if(c!=' ') {
				break;
			}
		}
		count = Integer.parseInt(numStr);
	}
	public void rand () {
		Random rd = new Random();
		boolean check[] = new boolean[count];
		int temp = 0;
		for(int i=0;i<3;i++) {
			check[i]=false;
		}
		for(int i=0;i<3;i++) {
			temp = rd.nextInt(count);
			if(check[temp]==false) {
				random[i] = temp+1;
				check[temp] = true;
			}
			else {
				i--;
			}
		}
	}
	public void check() {
		Scanner scanner = new Scanner(System.in);
		int strike = 0;
		int ball = 0;
		while(strike!=3) {
			int guess[] = new int[3];
			ball = strike = 0;
			System.out.print("�Է��� �� : ");
			for(int i=0;i<3;i++) {
				guess[i] = scanner.nextInt();
			}
			
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(random[i]==guess[j] && i==j) {
						strike++;
					}
					else if(random[i]==guess[j] && i!=j) {
						ball++;
					}
				}
			}
			System.out.println(ball+"BALL"+"\t"+strike+"STRIKE");
		}
		System.out.println("���� ¦¦¦");
	}
	public void Play() {
		do {
			count();
			rand();
			check();
			}while(regame());
	}
}