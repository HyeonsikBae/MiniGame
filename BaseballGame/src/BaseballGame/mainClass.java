package BaseballGame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class mainClass {
	
	public static final int LENGTH = 3;
	
	public static void main(String[] args) {
		
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
<<<<<<< HEAD
		scanner.close();		
=======
		scanner.close();
>>>>>>> 1701baf35e4d15b9237925426f982bae955eee28
	}
}