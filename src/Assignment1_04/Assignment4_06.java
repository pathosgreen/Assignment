package Assignment1_04;

import java.util.Scanner;

public class Assignment4_06 {
	public static void main(String[] args) {
		// 1부터 n까지의 합(계산식 포함)
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1부터 n까지 합 구하기");
		int n;
		do {
			System.out.print("양의 정수 : ");
			n = scanner.nextInt();
		}while(n<=0);
		
		int sum = 0;
		for(int i=1; i<n; i++) {
			System.out.print(i+" + ");
			sum+=i;
		}
		System.out.print(n + " = ");
		System.out.println(sum);
	}
}
