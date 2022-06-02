package Assignment1_18._3;

import Assignment1_17._01.Day;

/*
 * Human(Ver.5) 클래스는 인간 클래스이다.
 */
public class Human {
	// 이름을 나타내는 String형 필드
	private String name;
	// 신장을 나타내는 int형 필드
	private int height;
	// 체중을 나타내는 int형 필드
	private int weight;
	// 생일을 나타내는 Day형 필드
	private Day birthday;

	
	/*
	 * 사람 클래스 Human의 생성자
	 * @param name 이름 문자열
	 * @param height 신장 숫자
	 * @param weight 체중 숫자
	 * @param birthday 생일 날짜
	 */
	public Human(String name, int height, int weight, Day birthday) {
		this.name = name;this.height = height;
		this.weight = weight;this.birthday = new Day(birthday);
	}
	// 이름을 확인한다.
	public String getName() {
		return name;
	}
	// 신장을 확인한다.
	public int getHeight() {
		return height;
	}
	// 체중을 확인한다.
	public int getWeight() {
		return weight;
	}
	// 생일을 확인한다.
	public Day getBirthday() {
		return birthday;
	}
	
}
