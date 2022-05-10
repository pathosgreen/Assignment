package Assignment1;

import java.util.Scanner;

public class Assignment1_8 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(" 정숫값 입력 : ");
		int t = scanner.nextInt();
		
		if( t > 0 ) {
			if( t % 10 == 0 ) {
				System.out.println(" 10의 배수입니다. ");
			}else {
				System.out.println(" 10의 배수가 아닙니다. ");
			}
		}else {
			System.out.println(" 값이 음수입니다. ");
		}
	}
}
