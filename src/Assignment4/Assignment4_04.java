package Assignment4;

import java.util.Scanner;

public class Assignment4_04 {
	public static void main(String[] args) {
		// 0부터 양의 정수까지 카운트업
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("카운트업 합니다.");
		int x;
		do {
			System.out.print("양의 정수 : ");
			x = scanner.nextInt();
		}while(x<=0);
		
		for(int i=0; i<=x ; i++ ) {
			System.out.println(i);
		}
		
		
	}
}
