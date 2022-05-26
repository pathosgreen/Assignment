package Assignment1_14._4;

import Assignment1_14._2.Day;

// Ver.2
public class Account {
	
	// 필드
	private String name;
	private String no;
	private long balance;
	private Day openDay;
	
	// 생성자
	public Account(String name, String no, long balance,Day d) {
		super();
		this.name = name;
		this.no = no;
		this.balance = balance;
		openDay = new Day(d);
	}

	public String getName() {
		return name;
	}
	public String getNo() {
		return no;
	}
	public long getBalance() {
		return balance;
	}
	public Day getOepnDay() {
		return new Day(openDay);
	}
	
	void deposit(long k) {
		balance += k;
	}
	
	void withdraw(long k) {
		balance -= k;
	}
	
	public String toString() {
		return "{"+name+","+no+","+balance+"}";
	}
}
