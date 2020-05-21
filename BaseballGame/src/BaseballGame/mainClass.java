package BaseballGame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class mainClass {
	
	public static final int LENGTH = 3;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		// 야구게임 자릿수 선언
		System.out.print("몇까지의 수를 선택하시겠습니까 : ");
		int number = scanner.nextInt();
		
		// 답 저장할 ArrayList 생성
		ArrayList<Integer> answer = new ArrayList<>();
		
		// 랜덤변수 ArrayList에 저장 및 중복 수정
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
		//추측값 저장할 ArrayList 선언
		//반복문 내 들어갈 경우, remove가 필요 없다.
		ArrayList<Integer> guess = new ArrayList<>();
		
		int strike = 0;
		int ball = 0;
		
		//3 Strike 까지 반복
		while(strike!=3) {
			
			strike = 0;
			ball = 0;
			
			//추측값 입력			
			System.out.print("숫자를 입력해주세요 : ");
			for(int i=0;i<LENGTH;i++) {
				guess.add(scanner.nextInt());
			}
			//스트라이크 카운드. 같은자리, 같은값 확인			
			for(int i=0;i<LENGTH;i++) {
				if(ans.get(i)==guess.get(i)) {
					strike++;
				}
			}
			//볼 카운트. 같은값 확인후 스트라이크만큼 감소.
			for(int item : guess) {
				if(ans.contains(item)) {
					ball++;
				}
			}
			ball = ball-strike;
			
			System.out.println("볼 : "+ball+"\t스트라이크 : "+strike);
			
			//0번째 인덱스 삭제 3번.
			//0번이 사라지면 1번이 0번이 되고,2번이 1번이 된다.
			for(int i=0;i<LENGTH;i++) {
			guess.remove(0);
			}
		}
		System.out.println("정답~");
<<<<<<< HEAD
		scanner.close();		
=======
		scanner.close();
>>>>>>> 1701baf35e4d15b9237925426f982bae955eee28
	}
}