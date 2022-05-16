package Assignment6;

import java.util.Scanner;

public class FloatDoubleScanPrint {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("변수 x는 float형입니다. 변수 y는 double형 입니다.");
		System.out.print(" x : "); float x = scan.nextFloat();
		System.out.print(" y : "); double y = scan.nextDouble();
		
		System.out.println(" x = "+x);
		System.out.println(" y = "+y);
		
	}
}
