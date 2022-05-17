package Assignment1_02;

import java.util.Scanner;

public class Assignment2_5 {
	public static void main(String[] args) {
		// 3개의 정수중 중앙값 
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 A : ");
		int a = scanner.nextInt();
		System.out.print("정수 B : ");
		int b = scanner.nextInt();
		System.out.print("정수 C : ");
		int c = scanner.nextInt();
		
		int mid;
		if(a<b) {
			if(b<c) {
				mid = b;
			}else if(a<c) {
				mid = c;
			}else {
				mid = a;
			}
		}else if(a<c){
			mid = a;
		}else if(b<c) {
			mid = c;
		}else {
			mid = b;
		}
		System.out.println("중간값 = " + mid);
	}
}
