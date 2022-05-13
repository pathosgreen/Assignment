package Assignment5;

import java.util.Scanner;

public class Assignment5_10 {
	public static void main(String[] args) {
		// 읽은 정수 합산(음수제외)
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 더합니다.");
		System.out.print("몇개를 더할까요? : ");
		int n = scanner.nextInt();
		int sum = 0;
		int count = 0;
		int i;
		for(i=0;i<n;i++) {
			int t= scanner.nextInt();
			if(t<0) {
				System.out.println("음수는 더하지 않습니다.");
				continue;
			}
			sum +=t;
			count++;
		}
		System.out.println("합계는 "+sum+"입니다.");
		if(i!=0)
			System.out.println("평균은 "+sum/count+"입니다.");
	}
}
