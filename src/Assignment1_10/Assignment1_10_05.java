package Assignment1_10;

import java.util.Scanner;

public class Assignment1_10_05 {
	
	static void putChars(char c,int n) {
		while(n-- > 0) {
			System.out.print(c);
		}
	}
	
	static void putStars(int n) {
		putChars('*', n);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" 단수는 : ");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			putStars(i);
			System.out.println();
		}
	}
}
