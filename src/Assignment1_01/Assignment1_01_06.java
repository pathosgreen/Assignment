package Assignment1_01;

import java.util.Scanner;

public class Assignment1_01_06 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" 변수 A : "); int a = scanner.nextInt();
		System.out.print(" 변수 B : "); int b = scanner.nextInt();
		
		if( a > b ) {
			System.out.println(" A가 B보다 큼");
		}else if( a == b ) {
			System.out.println(" A와 B가 같음");
		}else {
			System.out.println(" A가 B보다 작음");
		}
	}
}
