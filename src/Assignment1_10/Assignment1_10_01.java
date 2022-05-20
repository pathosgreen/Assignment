package Assignment1_10;

import java.util.Scanner;

public class Assignment1_10_01 {
	
	static int sumup(int n) {
		int sum = 0;
		for (int i = 0; i <=n; i++) {
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 x까지 합 구하기");
		int x;
		do {
			System.out.print("x값 : ");
			x = sc.nextInt();
		}while(x<=0);
		
		System.out.println("1부터 "+x+"까지의 합 = "+sumup(x));
	}
}
