package Assignment1_08;

import java.util.Scanner;

public class Assignment1_08_01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("사람 수 : ");
		int n = scan.nextInt();
		int[] points = new int[n];
		
		System.out.println("점수를 입력하세요");
		int sum = 0;
		for(int i=0;i<n;i++) {
			System.out.print((i+1)+"번의 점수 : ");
			points[i]=scan.nextInt();
			sum += points[i];
		}
		
		int max = points[0];
		int min = points[0];
		for(int i=0;i<n;i++) {
			if(points[i]>max) max=points[i];
			if(points[i]<min) min=points[i];
		}
		
		System.out.println("합계 "+sum+"점.");
		System.out.println("평균 "+(double)sum/n+"점.");
		System.out.println("최고점 "+max+"점.");
		System.out.println("최저점 "+min+"점.");
		
	}
}
