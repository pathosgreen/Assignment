package Assignment2_05;

import java.util.Scanner;

public class Assignment2_05_3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a를 b로 나눕니다.");
		System.out.print("a : ");int a = sc.nextInt();
		System.out.print("b : ");int b = sc.nextInt();
		
		try {
			int div = a/b;
			System.out.println("나눠진 값 : "+div);
		} catch (Exception e) {
			System.err.println("0으로 나눌 수 없습니다. : "+e);
		}
	}
}
