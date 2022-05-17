package Assignment1_03;

import java.util.Scanner;

public class Assignment3_04 {
	public static void main(String[] args) {
		// 두개의 정숫값 받아 그 사이 모든값을 작은것부터 표시
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 a : "); int a = scanner.nextInt();
		System.out.print("숫자 b : "); int b = scanner.nextInt();
		
		if(a > b) {
			int temp = a;
			a=b;
			b=temp;
		}
		for(int i=a+1; i<b; i++) {
			System.out.print(i + " ");
		}
		
	}
}
