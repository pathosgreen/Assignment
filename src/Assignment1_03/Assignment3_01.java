package Assignment1_03;

import java.util.Scanner;

public class Assignment3_01 {
	public static void main(String[] args) {
		// 읽은 정숫값의 부호를 판정하여 표시(원하는만큼 반복)
		Scanner scanner = new Scanner(System.in);
		int retry;
		do {
			System.out.print(" 정숫값 ");int n = scanner.nextInt();
			if(n > 0) {
				System.out.println("n은 양수");
			}else if(n<0) {
				System.out.println("n은 음수");
			}else {
				System.out.println("n은 0");
			}
			System.out.print("다시 합니까? 1 = yes");
			retry = scanner.nextInt();
		}while(retry==1);
	}
}
