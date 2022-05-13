package Assignment5;

import java.util.Scanner;

public class Assignment5_02 {
	public static void main(String[] args) {
		// 입력한 달의 계절 표시 1~12외의 값을 입력시 재입력
		
		Scanner scanner = new Scanner(System.in);
		int retry;
		System.out.println(" 계절을 찾습니다.");
		do {
			int month;
			do {
				System.out.print("몇월입니까? : ");
				month = scanner.nextInt();
			}while(month<1 || month>12);
			
			if(month >=3 && month <=5) {
				System.out.println("봄입니다.");
			}else if(month >=6 && month <=8) {
				System.out.println("여름입니다.");
			}else if(month >=9 && month <=11) {
				System.out.println("가을입니다.");
			}else if(month ==12 || month ==1 || month == 2) {
				System.out.println("겨울입니다.");
			}
			System.out.print("다시 하시겠습니까? 1=Yes 2=No : ");
			retry = scanner.nextInt();
		}while(retry == 1);
		
	}
}
