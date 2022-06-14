package Assignment2_05;

import java.util.Scanner;

// 숫자 미입력시 Exception
public class Assignment2_05_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("숫자 입력 : ");
			int a = sc.nextInt();
			System.out.println("입력값 : "+a);
		} catch (Exception e) {
			System.err.println("숫자를 입력해주세요.");
		}
	}
}
