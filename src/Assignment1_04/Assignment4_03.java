package Assignment1_04;

import java.util.Scanner;

public class Assignment4_03 {
	public static void main(String[] args) {
		// 양의 정숫값을 0까지 카운트다운
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("카운트다운 합니다.");
		int x;
		do {
			System.out.print("양의 정수 : ");
			x = scanner.nextInt();
		}while(x<=0);
		
		for(; x>=0; x--) {
			System.out.println(x);
		}
	}
	
}
