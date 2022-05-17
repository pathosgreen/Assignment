package Assignment1_05;

import java.util.Scanner;

public class Assignment5_09 {
	public static void main(String[] args) {
		// 읽은 정숫값을 합산(합이 1000을 넘으려하면 종료)
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 더합니다.");
		System.out.print("몇개를 더할까요? : ");
		int n = scanner.nextInt();
		int sum=0;
		int i;
		for(i=0;i<n;i++) {
			int t=scanner.nextInt();
			if(sum + t >=1000) {
				System.out.println("합이 천을 넘었습니다.");
				System.out.println("마지막 값은 무시합니다.");
				break;
			}
			sum +=t;
		}
		System.out.println("합계는 "+sum+"입니다.");
		if(i!=0)
			System.out.println("평균은 "+sum/i+"입니다.");
	}
}
