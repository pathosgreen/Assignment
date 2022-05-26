package Assignment1_14._7;

public class HumanTester {
	public static void main(String[] args) {
		
		Human gildong = new Human("길동", 170, 60);
		Human chulsu = new Human("철수", 166, 72);
		
		gildong.putData();
		System.out.println("번호 : "+gildong.getId());
		System.out.println();
		
		chulsu.putData();
		System.out.println("번호 : "+chulsu.getId());
	}
}
