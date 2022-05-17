package Assignment1_02;

import java.util.Scanner;

public class Assignment2_8 {
	public static void main(String[] args) {
		// 3개 정숫값 오름차순(큰 수) 정렬
		Scanner scanner = new Scanner(System.in);
		System.out.print(" 정수 A : ");
		int a = scanner.nextInt();
		System.out.print(" 정수 B : ");
		int b = scanner.nextInt();
		System.out.print(" 정수 C : ");
		int c = scanner.nextInt();
		
		if(a<b) {
			int temp=b;
			b=a; a=temp;
		}
		if(b<c) {
			int temp=c;
			c=b; b=temp;
		}
		if(a<b) {
			int temp=b;
			b=a; a=temp;
		}



		System.out.println("제일 큰 수 : " + a);
		System.out.println("두번째 큰 수 : " + b);
		System.out.println("제일 작은 수 : " + c);
		
	}
}
