package Assignment1_02;

import java.util.Scanner;

public class Assignment2_10 {
	public static void main(String[] args) {
		//월 1~12 정숫값 받아 계절 표시
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~12 입력 : ");
		int month = scanner.nextInt();
		switch(month) {
		case 3:
		case 4:
		case 5: System.out.println("봄"); break;
		case 6:
		case 7:
		case 8: System.out.println("여름"); break;
		case 9:
		case 10:
		case 11: System.out.println("가을"); break;
		case 12:
		case 1:
		case 2: System.out.println("겨울"); break;
		default:System.out.println("그런 월은 없습니다.");
		}
	}
}
