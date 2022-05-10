package Assignment1;

import java.util.Scanner;

public class Assignment1_5 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(" 정숫값 입력 : " );
		int n = scanner.nextInt();
		
		if( n > 0 ) {
			System.out.println(" 양수입니다. ");
		}else if( n == 0 ) {
			System.out.println(" 0입니다. ");
		}else {
			System.out.println(" 음수입니다. ");
		}
		
	}
}
