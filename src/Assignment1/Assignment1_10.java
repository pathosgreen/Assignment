package Assignment1;

import java.util.Scanner;

public class Assignment1_10 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(" 점수 입력 : ");
		int score = scanner.nextInt();
		
		if( score > 100 ) {
			System.out.println(" 잘못된 점수입니다. ");
		}else if(score >= 80){
			System.out.println(" 수 ");
		}else if(score >= 70){
			System.out.println(" 우 ");
		}else if(score >= 60){
			System.out.println(" 미 ");
		}else if(score >= 50){
			System.out.println(" 양 ");
		}else {
			System.out.println(" 가 ");
		}
	}
}