package Assignment1_17._07;
// Ver.1
public class Account {
	
	// 필드
	private String name;
	private String no;
	private long balance;
	
	// 생성자
	public Account(String name, String no, long balance) {
		super();
		this.name = name;
		this.no = no;
		this.balance = balance;
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
	
	void deposit(long k) {
		balance += k;
	}
	
	void withdraw(long k) {
		balance -= k;
	}
}
