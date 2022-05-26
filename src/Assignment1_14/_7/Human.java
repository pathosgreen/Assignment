package Assignment1_14._7;

import Assignment1_14._2.Day;

//사람 클래스 ver.4
public class Human {
	
	// 필드
	private static int counter = 0;
	private String name; // 이름
	private int height; // 신장
	private int weight; // 체중
	private int id; // 식별번호
	
	// 생성자
	public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		id = ++counter;
	}

	// 메소드
	public String getName() {return name;}
	public int getHeight() {return height;}
	public int getWeight() {return weight;}	
	
	void gainWeight(int w) {weight += w;}
	void reduceWeight(int w) {weight -= w;}
	
	public int getId() {return id;}
	
	public void putData() {
		System.out.println("이름 : "+name);
		System.out.println("신장 : "+height+"cm");
		System.out.println("체중 : "+weight+"kg");
	}
	
}
