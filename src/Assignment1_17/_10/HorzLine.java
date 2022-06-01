package Assignment1_17._10;

/*
 * HorzLine 클래스는 수평선을 나타내는 추상 클래스이다.
 * 이 클래스는 직선을 나타내는 추상 클래스 AbsLine로부터 파생되는 클래스이다.
 * @See Shape
 * @See AbstLine
 */
public class HorzLine extends AbstLine {
	/*
	 * 직선을 생성하는 생성자이다.
	 * 길이를 인수로 받는다.
	 * @param langth 생성할 직선의 길이
	 */
	public HorzLine(int length) {
		super(length);
	}
	/*
	 * toString 메서드는 수평선에 관련된 도형 정보를 문자열로 반환한다.
	 * @return 문자열 "HorzLine(length:3)"을 반환한다.
	 * 3 부분은 길이에 해당하는 값이다.
	 */
	public String toString() {
		return "HorzLine(length:"+getLength()+")";
	}
	/*
	 * draw 메서드는 수평선을 그린다.
	 * 길이의 개수만큼'-'를 연속적으로 표시하고 줄 바꿈한다.
	 */
	public void draw() {
		for(int i=1;i<=getLength();i++)
			System.out.print("-");
		System.out.println();
	}
}
