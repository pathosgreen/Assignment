package Assignment1;

import java.util.Scanner;

public class Assignment1_9 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(" 정숫값 입력 : ");
		int t = scanner.nextInt();
		
		if( t > 0) {
			int s = t % 3;
			if( s == 0) {
				System.out.println(" 3으로 나눠집니다. ");
			}else {
				System.out.println(" 3으로 나누어지지 않습니다.");
				System.out.println(" 나머지는 " + s + " 입니다. ");
			}
		}else {
			System.out.println(" 값이 음수입니다. ");
		}
	}
}
