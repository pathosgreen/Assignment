package Assignment2_02;

import java.util.Scanner;

public class Assignment2_02_5 {
	
	static void Add(int a,int b) {
		System.out.println(a+"+"+b+"="+(a+b)+"입니다.");
	}
	
	static void Sub(int a,int b) {
		 System.out.println(a+"-"+b+"="+(a-b)+"입니다.");
	}
	 
	static void Mul(int a,int b) {
		 System.out.println(a+"*"+b+"="+(a*b)+"입니다.");
	}
	 
	static void Div(int a,int b) {
		 System.out.println(a+"/"+b+"="+(a/b)+"입니다.");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 a : "); int a = sc.nextInt();
		System.out.print("정수 b : "); int b = sc.nextInt();
		
		Add(a,b);
		Sub(a, b);
		Mul(a, b);
		Div(a, b);
		
	}
}
