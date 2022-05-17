package Assignment1_01;

import java.util.Scanner;

public class Assignment1_01_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정숫값 입력 : ");
		int n = scanner.nextInt();
		
		if(n >= 0) {
			System.out.println("절댓값 = " + n);
		}else {
			System.out.println("절댓값 = " + -n);
		}
	}
}
