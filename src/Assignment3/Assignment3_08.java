package Assignment3;

import java.util.Scanner;

public class Assignment3_08 {
	public static void main(String[] args) {
		// 읽은 값 수만큼 *,+를 번갈아가면서 표시
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력값 : "); int s = scanner.nextInt();	
		for( ; s>=2; s-=2) {
			System.out.print("*+");
		}
		if(s==1) {
			System.out.print("*");
			s--;
		}
	}
}
