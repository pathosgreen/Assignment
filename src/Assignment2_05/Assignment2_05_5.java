package Assignment2_05;

import java.util.Scanner;

public class Assignment2_05_5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열로 저장될 숫자 a : ");String a = sc.next();
		System.out.print("문자열로 저장될 숫자 b : ");String b = sc.next();
		
		System.out.println("문자열 "+a+" + "+b+" = "+a+b);
		
		int aa = Integer.parseInt(a);
		int bb = Integer.parseInt(b);
		
		System.out.println("int로 변환된 "+aa+" + "+bb+" = "+ (aa+bb));
	}
}
