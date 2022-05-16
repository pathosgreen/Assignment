package Assignment6;

import java.util.Scanner;

public class OctHex {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" 정수 : ");
		int x = scan.nextInt();
		
		System.out.printf("8진수는 %o 입니다.\n ", x);
		System.out.printf("16진수는 %x 입니다.\n ", x);
	}
}
