package Assignment1_05;

import java.util.Scanner;

public class Assignment5_01_2 {
	public static void main(String[] args) {
		// 1부터 n까지 정수값의 제곱 표시(방법1)
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정숫값 : ");
		int n = scanner.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println(i + "의 제곱은 "+i*i+"입니다.");
		}
		
		
	}
}
