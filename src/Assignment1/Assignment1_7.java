package Assignment1;

import java.util.Scanner;

public class Assignment1_7 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" 정숫값 입력 : ");
		int f = scanner.nextInt();
		
		if(f > 0) {
			if(f % 5 == 0 ) {
				System.out.println(" 5로 나누어집니다. ");
			}else {
				System.out.println(" 5로 나누어지지 않습니다. ");
			}
		}else {
			System.out.println(" 값이 음수입니다. ");
		}
	}
}
