package Assignment1_02;

import java.util.Scanner;

public class Assignment2_6 {
	public static void main(String[] args) {
		// 두 정숫값중 작은값과 큰값
		Scanner scanner = new Scanner(System.in);
		System.out.print(" 정수 A : ");
		int a = scanner.nextInt();
		System.out.print(" 정수 B : ");
		int b = scanner.nextInt();

		if( a == b ) {
			System.out.println(" 둘이 같음.");
		}else{
			int max,min;
			if(a>b){
				max = a;
				min = b;
			}else {
				max = b;
				min = a;
			}
			System.out.println(" 최댓값 : " + max);
			System.out.println(" 최솟값 : " + min);
		}
	}
}
