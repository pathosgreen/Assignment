package Assignment1_02;

import java.util.Scanner;

public class Assignment2_4 {
	public static void main(String[] args) {
		// 3개 정수값중 최솟값
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 A : ");
		int a = scanner.nextInt();
		System.out.print("정수 B : ");
		int b = scanner.nextInt();
		System.out.print("정수 C : ");
		int c = scanner.nextInt();
		
		int min = a;
		if(a>b) {min = b;}
		if(b>c) {min = c;}
		System.out.println(" 최솟값 = " + min);
	}
}
