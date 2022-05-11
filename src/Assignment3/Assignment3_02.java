package Assignment3;

import java.util.Scanner;

public class Assignment3_02 {
	public static void main(String[] args) {
		// 3자리 양의 정숫값 읽기(3자리가 아니면 다시 작성)
		Scanner scanner = new Scanner(System.in);
		int x;
		do {
			System.out.print("세자리 수 입력");
			x = scanner.nextInt();
		}while(x>1000 || x<99);
		System.out.println("입력한 값 : " + x);
	}
}
