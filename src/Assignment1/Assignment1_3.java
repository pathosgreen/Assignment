package Assignment1;

import java.util.Scanner;

public class Assignment1_3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" 변수 A : "); int a = scanner.nextInt();
		System.out.print(" 변수 B : "); int b = scanner.nextInt();
		
		if(a % b == 0 ) {
			System.out.println("B는 A의 약수입니다.");
		}else {
			System.out.println("B는 A의 약수가 아닙니다.");
		}
		
	}
}
