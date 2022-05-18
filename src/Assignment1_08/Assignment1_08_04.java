package Assignment1_08;

import java.util.Scanner;

public class Assignment1_08_04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int n = scan.nextInt();
		double[] a = new double[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("a["+i+"] = ");
			a[i] = scan.nextDouble();
		}
		
		double sum = 0;
		for(double i : a)
			sum += i;
		
		System.out.println("합계 = "+sum);
		System.out.println("평균 = "+sum/n);
	}
}
