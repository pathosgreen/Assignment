package Assignment1_05;

import java.util.Scanner;

public class Assignment5_04 {
	public static void main(String[] args) {
		// 왼쪽 아래가 직각인 이등변삼각형
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("왼쪽 아래가 직각인 이등변삼각형을 만듭니다.");
		System.out.print("단수는? : ");
		int n = scanner.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {	
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
