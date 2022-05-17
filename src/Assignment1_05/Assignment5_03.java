package Assignment1_05;

import java.util.Scanner;

public class Assignment5_03 {
	public static void main(String[] args) {
		// *을 나열해서 정방형 표시
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정방형을 표시합니다.");
		System.out.print("단수는 : ");
		int n = scanner.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
