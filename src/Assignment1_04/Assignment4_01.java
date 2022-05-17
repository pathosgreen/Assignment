package Assignment1_04;

import java.util.Scanner;

public class Assignment4_01 {
	public static void main(String[] args) {
		// 1부터 n까지의 곱 구하기
		Scanner scanner = new Scanner(System.in);
		int n;
		do {
			System.out.print("양의 정숫값 : ");
			n = scanner.nextInt();
		}while(n<=0);
		
		int factorial = 1;
		int i = 1;
		
		while(i <= n) {
			factorial *= i;
			i++;
		}
		System.out.println("1부터 "+n+"까지의 곱은 "+factorial+"입니다.");
		
	}
}
