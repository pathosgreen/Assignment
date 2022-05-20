package Assignment1_10;

import java.util.Scanner;

public class Assignment1_10_07 {
	
	static Scanner sc = new Scanner(System.in);
	
	static int readPlusInt() {
		int x;
		do {
			System.out.print("양의 정숫값 : ");
			x = sc.nextInt();
		}while(x <= 0);
		return x;
	}
	
	public static void main(String[] args) {
		
		int x;
		do {
			int n = readPlusInt();
			
			System.out.print("반대로 읽으면 ");
			while (n>0) {
				System.out.print(n%10);
				n /=10;
			}
			System.out.println("입니다.");
			do {
				System.out.print("다시 한번? 1=yes 0=no : ");
				x = sc.nextInt();
			}while(x!=0 && x!=1);
		}while(x == 1);
	}
}
