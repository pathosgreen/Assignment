package Assignment2_03;

import java.util.Scanner;

// 삼항연산자로 최대와 최댓값
public class Assignment2_03_5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 값 : ");int a = sc.nextInt();
		System.out.print("두번째 값 : ");int b = sc.nextInt();
		System.out.print("세번째 값 : ");int c = sc.nextInt();
		
		int max = (a>b) ? ( (a>c) ? a : c ) : ((b>c) ? b : c );
		System.out.println("최댓값 : "+max);
	}
}
