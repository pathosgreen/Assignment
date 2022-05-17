package Assignment1_03;

import java.util.Scanner;

public class Assignment3_05 {
	public static void main(String[] args) {
		//양의 정숫값을 0까지 카운트다운
		Scanner scanner = new Scanner(System.in);

		int a;
		do {
			System.out.print("양수 a : ");  a = scanner.nextInt();
		}while(a<=0);
		
		while(a>=0) {
			System.out.print(a-- +" ");
		}
		System.out.println();
		System.out.print("현재 값 : " + a);
	}
}
