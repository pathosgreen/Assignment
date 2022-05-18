package Assignment1_08;

import java.util.Random;
import java.util.Scanner;

public class Assignment1_08_10 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		String[] monthString = { "January","February","March","April","May","June","July",
				"August","September","October","November","December"};
		
		System.out.println("해당 월의 영단어 입력하기");
		System.out.println("첫단어는 대문자 나머지는 소문자로 입력하세요");
		
		int retry;
		int last = -1;
		
		do {
			int month;
			do {
				month = rand.nextInt(12);
			}while(month==last);
			last = month;
			while(true) {
				System.out.print(month+1+"월 : ");
				String s = scan.next();
				
				if(s.equals(monthString[month])) break;
				System.out.println("틀렸습니다.");
			}
			System.out.print("정답입니다. 다시 한번? 1 = yes : ");
			retry = scan.nextInt();
		}while(retry==1);
	}
}
