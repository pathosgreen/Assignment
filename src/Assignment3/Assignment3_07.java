package Assignment3;

import java.util.Scanner;

public class Assignment3_07 {
	public static void main(String[] args) {
		// 입력값만큼 * 표시
		Scanner scanner = new Scanner(System.in);
		System.out.print("* 갯수 : "); int s = scanner.nextInt();
		if(s > 0) {
			for(; s>0; s--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
