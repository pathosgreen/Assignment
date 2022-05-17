package Assignment1_03;

import java.util.Scanner;

public class Assignment3_09 {
	public static void main(String[] args) {
		// 양의 정숫값을 읽어 자리수를 표시
		Scanner scanner = new Scanner(System.in);
		System.out.println(" 양의 정수값의 자리수 표시");
		int a;
		do {
			System.out.print("양의 정숫값 : "); a = scanner.nextInt();			
		}while(a<=0);
		int l=0;
		while(a>0) {
			a/=10; l++;
		}
		System.out.println("입력한 숫자는 "+l+"자리 숫자");
		
		
	}
}
