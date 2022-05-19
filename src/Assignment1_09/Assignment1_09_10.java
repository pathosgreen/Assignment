package Assignment1_09;

import java.util.Scanner;

public class Assignment1_09_10 {
	
	static int min(int a,int b,int c) {
		int min = a;
		if(b<min) min = b;
		if(c<min) min = c;
		return min;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 a : "); int a = sc.nextInt();
		System.out.print("정수 b : "); int b = sc.nextInt();
		System.out.print("정수 c : "); int c = sc.nextInt();
		
		System.out.println("최솟값 : "+min(a,b,c));
		
	}
}
