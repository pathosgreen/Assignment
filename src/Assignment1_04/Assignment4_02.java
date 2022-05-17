package Assignment1_04;

import java.util.Scanner;

public class Assignment4_02 {
	public static void main(String[] args) {
		// 읽은 개수만큼 * 표시
		Scanner scanner = new Scanner(System.in);
		System.out.print("몇개의 *을 표시할까요");
		int s = scanner.nextInt();
		
		if(s > 0) {
			for(int i=0; i<s; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
	}
}
