package Assignment5;

import java.util.Scanner;

public class Assignment5_01_1 {
	public static void main(String[] args) {
		// 1부터 n까지 정수값의 제곱 표시(방법1)
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정숫값 : ");
		int n = scanner.nextInt();
		for(int i=1,j=1; i<=n; i++,j=i*i) {
			System.out.println(i + "의 제곱은 "+j+"입니다.");
		}
		
		
	}
}
