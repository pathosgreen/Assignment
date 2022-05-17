package Assignment1_05;

import java.util.Scanner;

public class Assignment5_08 {
	public static void main(String[] args) {
		// 읽은 정숫값을 합산(0을 입력시 종료)
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 더합니다.");
		System.out.print("몇개를 더할까요? : ");
		int n = scanner.nextInt();
		int sum=0;
		int i;
		for(i=0;i<n;i++) {
			int t=scanner.nextInt();
			if(t==0) break;
			sum +=t;
		}
		System.out.println("합계는 "+sum+"입니다.");
		if(i!=0)
			System.out.println("평균은 "+sum/i+"입니다.");
	}
}
