package Assignment1_01;

import java.util.Scanner;

public class Assignment1_01_04 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" 변수 A : "); int a = scanner.nextInt();
		System.out.print(" 변수 B : "); int b = scanner.nextInt();
		
		if(!(a % b == 0 ) ) {
			System.out.println("B는 A의 약수가 아닙니다.");
		}else {
			System.out.println("B는 A의 약수입니다.");
		}
		
		
	}
}
