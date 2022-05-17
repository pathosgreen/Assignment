package Assignment1_03;

import java.util.Random;
import java.util.Scanner;

public class Assignment3_03 {
	public static void main(String[] args) {
		// 2자리 정숫값 맞추기 게임 난수 if do 쓰기
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int no = 10 + random.nextInt(90);
		System.out.println("숫자 맞추기 시작");
		System.out.println("10~99 입력");
		int x;
		do {
			System.out.print("> ");
			x = scanner.nextInt();
			if(x>no) {
				System.out.println("더 작음");
			}else if(x<no) {
				System.out.println("더 큼");
			}
		}while(x!=no);
		System.out.println(" 정답 ");
	}
}
