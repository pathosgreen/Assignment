package Assignment4;

import java.util.Scanner;

public class Assignment4_08 {
	public static void main(String[] args) {
		// 읽은 개수만큼 *표시 (5개단위로 줄바꿈)
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" 몇개의 *을 표시할까요 : ");
		int s= scanner.nextInt();
		if( s > 0) {
			for(int i=0;i<s;i++) {
				System.out.print("*");
				if(i % 5 == 4) {
					System.out.println();
				}
			}
		}
		if( s % 5 !=0) {
			System.out.println();
		}
		
	}
}
