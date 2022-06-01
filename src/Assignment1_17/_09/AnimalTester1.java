package Assignment1_17._09;
// 동물 클래스(Ver.1) 테스트 프로그램
public class AnimalTester1 {
	public static void main(String[] args) {
		
		Animal[] a = new Animal[2];
		a[0] = new Dog("뭉치","치와와");
		a[1] = new Cat("마이클",7);
		
		for(int i=0;i<a.length;i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
		for(int i=0;i<a.length;i++) {
			System.out.print("a["+i+"] = ");
			a[i].introduce();
		}
	}			
}
