package Assignment5;

import java.util.Scanner;

public class Assignment5_07 {
	public static void main(String[] args) {
		// 양의 정숫값을 받아 소수인지 판별
		
		Scanner scanner = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("2이상의 정숫값 : ");
			n = scanner.nextInt();
		}while(n<=1);
		
		int i;
		for(i=2; i<n; i++) {
			if(n%i ==0) {
				break;
			}			
		}
		if (i==n) {
			System.out.println("소수입니다.");
		}else {
			System.out.println("소수가 아닙니다.");
		}
	}
}
