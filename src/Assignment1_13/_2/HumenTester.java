package Assignment1_13._2;

public class HumenTester {
	
	public static void main(String[] args) {
		
		Humen gildong = new Humen("길동",170,60);
		Humen chulsu = new Humen("철수",166,72);
		
		gildong.gainWeight(3);
		chulsu.reduceWeight(5);
		
		System.out.println("이름 : " + gildong.name);
		System.out.println("신장 : " + gildong.height+"cm");
		System.out.println("체중 : " + gildong.weight+"kg");
		System.out.println();
		
		System.out.println("이름 : " + chulsu.name);
		System.out.println("신장 : " + chulsu.height+"cm");
		System.out.println("체중 : " + chulsu.weight+"kg");

	}
}
