package Assignment1_14._5;

import Assignment1_14._2.Day;

//사람 클래스 ver.3
public class Human {
	
	// 필드
	private String name; // 이름
	private int height; // 신장
	private int weight; // 체중
	private Day birthDay; // 생일
	
	// 생성자
	public Human(String name, int height, int weight, Day birthDay) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.birthDay = new Day(birthDay);
	}

	// 메소드
	public String getName() {return name;}
	public int getHeight() {return height;}
	public int getWeight() {return weight;}
	public Day getBirthDay() {return birthDay;}
	
	
	void gainWeight(int w) {weight += w;}
	void reduceWeight(int w) {weight -= w;}
	
	public void putData() {
		System.out.println("이름 : "+name);
		System.out.println("신장 : "+height+"cm");
		System.out.println("체중 : "+weight+"kg");
	}
	public String toString() {
		return "{"+name+":"+height+"cm"+weight+"kg"+birthDay+"출생";
	}
	
}
