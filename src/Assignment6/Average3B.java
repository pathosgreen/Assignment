package Assignment6;

import java.util.Scanner;

public class Average3B {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정숫값 x,y,z의 평균을 구합니다.");
		System.out.print("x값 : "); int x = scan.nextInt();
		System.out.print("y값 : "); int y = scan.nextInt();
		System.out.print("z값 : "); int z = scan.nextInt();
		
		double ave = (double)(x+y+z)/3;
		System.out.printf("x,y,z의 평균은 %.3f 입니다.\n", ave);
	}
}
