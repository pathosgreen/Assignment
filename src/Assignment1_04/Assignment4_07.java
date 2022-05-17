package Assignment1_04;

import java.util.Scanner;

public class Assignment4_07 {
	public static void main(String[] args) {
		// 신장별 표준 체중 대응표 표시(체중 = (신장-100)*0.9)
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" 몇cm부터: "); int hMin = scanner.nextInt();
		System.out.print(" 몇cm까지: "); int hMax = scanner.nextInt();
		System.out.print(" 몇cm단위: "); int step = scanner.nextInt();
		System.out.println(" 신장 표준 체중 ");
		System.out.println("----------------");
		for(int i = hMin; i<=hMax; i+=step ) {
			System.out.println(i + " " + 0.9*(i - 100));
		}
		
		
	}
}
