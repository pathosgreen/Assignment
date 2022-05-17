package Assignment1_02;

import java.util.Scanner;

public class Assignment2_2 {
	public static void main(String[] args) {
		// 읽은 정수값의 차
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" 정수 A : ");
		int a = scanner.nextInt();
		System.out.print(" 정수 B : ");
		int b = scanner.nextInt();
		
		int diff;
		if( a > b ) {
			diff = a-b;
		}else {
			diff = b-a;
		}
		System.out.println("값의 차이 : " + diff);
		
	}
}
