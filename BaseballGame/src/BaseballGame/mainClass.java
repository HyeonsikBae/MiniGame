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
		
		//답맞추기
		while(true){
			
			//볼, 스트라이크 카운트 선언 및 초기화
			int ballCount=0;
			int StrikeCount=0;
			
			//추측 저장할 ArrayList 선언
			ArrayList<Integer> guess = new ArrayList<>();
			
			//ArrayList에 추측값 저장
			System.out.print("숫자를 입력해주세요 : ");
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
			
			//guess, ball, strike 출력
			System.out.println(guess);
			System.out.print("볼 : " + ballCount);
			System.out.println("\t스트라이크 : " + StrikeCount);
			
			//3strike면 while문 탈출
			if(StrikeCount==LENGTH) break;
		}
		System.out.println("정답~");
		scanner.close();
	}
}
