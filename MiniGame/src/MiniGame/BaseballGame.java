package MiniGame;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BaseballGame {
	
	public static final int LENGTH = 3;

public static void main() {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		String select="";
		boolean bool = true;
		
		
		while(bool) {
			int strike = 0;
			int ball = 0;
			select="";
			int array[] = new int[3];
			
			//�������� ����
			for(int i=0;i<3;i++) {
				array[i] = random.nextInt(10)+1;
				for(int j=0;j<3;j++) {
					if(array[i] == array[j] && i != j) {
						i--;
					}
				}
			}
			
			
			while(strike!=3) {
				int guess[] = new int[3];
				ball = strike = 0;
				System.out.print("Input number : ");
				for(int i=0;i<3;i++) {
					guess[i] = scanner.nextInt();
				}
				
				for(int i=0;i<3;i++) {
					for(int j=0;j<3;j++) {
						if(array[i]==guess[j] && i==j) {
							strike++;
						}
						else if(array[i]==guess[j] && i!=j) {
							ball++;
						}
					}
				}
				System.out.println(ball+" BALL"+"\t"+strike+" STRIKE");
			}
			System.out.println("CLEAR ^~^b");
		
			while(!select.equals("Y")&&!select.equals("N")) {
				select = "";
				System.out.print("Do you want replay? Y/N");
				select = scanner.next();
				if(select.equals("Y")) {
					bool = true;
				}
				else if(select.equals("N")) {
					bool = false;
				}
				else {
					System.out.println("ERROR!");
				}
			}
		}
		System.out.println("Finish the Baseball Game");
	}
	
	//Code With AraryList
	//Need to add replay funtion
	/*
	public static void main() {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		// �߱����� �ڸ��� ����
		System.out.print("������� ���� �����Ͻðڽ��ϱ� : ");
		int number = scanner.nextInt();
		
		// �� ������ ArrayList ����
		ArrayList<Integer> answer = new ArrayList<>();
		
		// �������� ArrayList�� ���� �� �ߺ� ����
		for(int i=0;i<LENGTH;i++) {
			answer.add(random.nextInt(number)+1);
			for(int j=0;j<i;j++) {
				if(answer.get(i)==answer.get(j)) {
					answer.remove(i);
					i--;
				}
			}
		}
		sol(answer);
	}
	
	public static void sol(ArrayList<Integer> ans) {
		
		Scanner scanner = new Scanner(System.in);
		//������ ������ ArrayList ����
		//�ݺ��� �� �� ���, remove�� �ʿ� ����.
		ArrayList<Integer> guess = new ArrayList<>();
		
		int strike = 0;
		int ball = 0;
		
		//3 Strike ���� �ݺ�
		while(strike!=3) {
			
			strike = 0;
			ball = 0;
			
			//������ �Է�			
			System.out.print("���ڸ� �Է����ּ��� : ");
			for(int i=0;i<LENGTH;i++) {
				guess.add(scanner.nextInt());
			}
			//��Ʈ����ũ ī���. �����ڸ�, ������ Ȯ��			
			for(int i=0;i<LENGTH;i++) {
				if(ans.get(i)==guess.get(i)) {
					strike++;
				}
			}
			//�� ī��Ʈ. ������ Ȯ���� ��Ʈ����ũ��ŭ ����.
			for(int item : guess) {
				if(ans.contains(item)) {
					ball++;
				}
			}
			ball = ball-strike;
			
			System.out.println("�� : "+ball+"\t��Ʈ����ũ : "+strike);
			
			//0��° �ε��� ���� 3��.
			//0���� ������� 1���� 0���� �ǰ�,2���� 1���� �ȴ�.
			for(int i=0;i<LENGTH;i++) {
			guess.remove(0);
			}
		}
		System.out.println("����~");
		scanner.close();
	}
	*/
}