package Assignment1_14._4;

import Assignment1_14._2.Day;

public class AccountTester1 {
	public static void main(String[] args) {
		
		Day d = new Day(2020,10,15);
		Account gildong = new Account("길동", "125678", 100, d);
		
		Day p = gildong.getOepnDay();
		System.out.println("계좌 생성일 : "+p);
		
		p.set(1999, 12, 31);
		
		Day q = gildong.getOepnDay();
		
		System.out.println("계좌 개설일 : "+q);
		
	}
}
