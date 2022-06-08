package Assignment2_02;

import java.util.Scanner;

public class Assignment2_02_1_h {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("연도 : ");
		int year = sc.nextInt();
		
		if(year%2==0) {
			System.out.println(year+"년도는 짝수입니다.");
		}else {
			System.out.println(year+"년도는 홀수입니다.");
		}
		if(year%4==0) { // 연도가 4로 나눠지는가?
				System.out.println(year+"년도는 윤년입니다.");
		}else {
			System.out.println(year+"년도는 윤년이 아닙니다.");
		}
	}
}
