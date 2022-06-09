package Assignment2_03;

import java.util.Scanner;

public class Assignment2_03_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("시프트할 값 : "); int po = sc.nextInt();
		int bo;
		do {
			System.out.print("시프트할 방향(0=왼쪽 1=오른쪽 : ");bo = sc.nextInt();
		} while (bo>2 || bo<0);
		System.out.println("시프트할 횟수 : ");int time = sc.nextInt();
		int abc;
		if(bo==1) {
			abc = (po>>time);
		}else {
			abc = (po<<time);
		}
		System.out.println("결과값 : "+abc);
		
	}
}
