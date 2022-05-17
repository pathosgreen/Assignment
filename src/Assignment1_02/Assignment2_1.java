package Assignment1_02;

import java.util.Scanner;

public class Assignment2_1 {
	public static void main(String[] args) {
		// 실수값 두개 받고 큰값 (if문)
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("실수 A : ");
		double a = scanner.nextDouble(); 
		System.out.print("실수 B : ");
		double b = scanner.nextDouble(); 
		
		double max;
		if( a > b ) {
			max = a;
		}else {
			max = b;
		}
		
		System.out.println(" 큰 값 : " + max);
		
	}
	
}
