package Assignment1_09;

import java.util.Scanner;

public class Assignment1_09_03 {
	
		static int med3(int a,int b,int c) {
			if(a>=b)
				if(b>=c)
					return b;
				else if (a<=c)
					return a;
				else
					return c;
			else if(a > c)
				return a;
			else if(b > c)
				return c;
			else
				return b;
		}

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 a : "); int a = sc.nextInt();
		System.out.print("정수 b : "); int b = sc.nextInt();
		System.out.print("정수 c : "); int c = sc.nextInt();
		
		System.out.println("중간값은 "+med3(a,b,c)+"입니다.");
	}
}
