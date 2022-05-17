package Assignment1_02;

import java.util.Scanner;

public class Assignment2_7 {
	public static void main(String[] args) {
		// 두 정숫값을 내림차순(큰 순) 정렬
		Scanner scanner = new Scanner(System.in);
		System.out.print(" 정수 A : ");
		int a = scanner.nextInt();
		System.out.print(" 정수 B : ");
		int b = scanner.nextInt();
		if(a<b) {
			int c=b;
			b=a; a=c;
		}
		System.out.println("큰 수 : "+a);
		System.out.println("작은 수 : "+b);
		
	}
}
