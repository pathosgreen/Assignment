package Assignment2;

import java.util.Scanner;

public class Assignment2_3 {
	public static void main(String[] args) {
		// 두 정수값 차 10이하 or 11이상 표시
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 A : ");
		int a = scanner.nextInt();
		System.out.print("정수 B : ");
		int b = scanner.nextInt();
		
		if(a-b<=10 && a-b>=-10 ) {
			System.out.println("두 값의 차 10 이하");
		}else {
			System.out.println("두 값의 차 10 초과");
		}
	}
}
