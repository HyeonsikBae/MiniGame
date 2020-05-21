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
		
		//����߱�
		while(true){
			
			//��, ��Ʈ����ũ ī��Ʈ ���� �� �ʱ�ȭ
			int ballCount=0;
			int StrikeCount=0;
			
			//���� ������ ArrayList ����
			ArrayList<Integer> guess = new ArrayList<>();
			
			//ArrayList�� ������ ����
			System.out.print("���ڸ� �Է����ּ��� : ");
			for(int i=0;i<LENGTH;i++) {
				guess.add(scanner.nextInt());
			}
		
			//Ball check
			for(int item : guess) {
				if(answer.contains(item)) {
					ballCount++;
				}
			}
			
			//Strike check
			for(int i=0;i<LENGTH;i++) {
				if(answer.get(i)==guess.get(i)) {
					ballCount--;
					StrikeCount++;
				}
			}
			
			//guess, ball, strike ���
			System.out.println(guess);
			System.out.print("�� : " + ballCount);
			System.out.println("\t��Ʈ����ũ : " + StrikeCount);
			
			//3strike�� while�� Ż��
			if(StrikeCount==LENGTH) break;
		}
		System.out.println("����~");
		scanner.close();
	}
}
