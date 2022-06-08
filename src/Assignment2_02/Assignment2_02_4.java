package Assignment2_02;

import java.util.Scanner;

public class Assignment2_02_4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실수 a : ");float a = sc.nextFloat();
		System.out.print("실수 b : ");float b = sc.nextFloat();
		
		System.out.print("덧셈(1) 뺄셈(2) 곱셈(3) 나눗셈(4) 선택 : ");
		int t = sc.nextInt();
		switch(t) {
		case 1:System.out.println(a+" + "+b+" = "+(a+b)); break;
		case 2:System.out.println(a+" - "+b+" = "+(a-b)); break;
		case 3:System.out.println(a+" * "+b+" = "+(a*b)); break;
		case 4:System.out.println(a+" / "+b+" = "+(a/b)); break;
		default:System.out.println("해당되는 숫자가 아닙니다.");
		}
		
	}
}
