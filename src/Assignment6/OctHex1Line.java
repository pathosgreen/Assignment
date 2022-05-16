package Assignment6;

import java.util.Scanner;

public class OctHex1Line {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int x = scan.nextInt();
		
		System.out.printf("8진수는 %o이고 16진수는 %x입니다.", x, x);
	}
}
