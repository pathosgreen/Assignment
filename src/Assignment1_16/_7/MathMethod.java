package Assignment1_16._7;

import java.util.Scanner;

public class MathMethod {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("실수 : ");
		double x = stdIn.nextDouble();
		
		System.out.println("절댓값 : "+Math.abs(x));
		System.out.println("제곱근 : "+Math.sqrt(x));
		System.out.println("넓이 : "+Math.PI*x*x);
	}
}
