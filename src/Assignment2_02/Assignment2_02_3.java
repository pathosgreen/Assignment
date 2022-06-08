package Assignment2_02;

import java.util.Scanner;

public class Assignment2_02_3 {
	public static void main(String[] args) {
//		a = 97, A = 65, z = 122, Z = 90
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 한 자 : ");
		char ch = sc.next().charAt(0);
		System.out.println("입력한 글자 = " +ch);
		int in = (int)ch;
		if(in<=90 && in>=65) {
			System.out.println("대소문자 변환 : "+(char)(in+32));
		}else if(in<=122 && in>=97) {
			System.out.println("대소문자 변환 : "+(char)(in-32));
		}else {
			System.out.println("알파벳 한 글자가 아닙니다.");
		}
		
	}
}
