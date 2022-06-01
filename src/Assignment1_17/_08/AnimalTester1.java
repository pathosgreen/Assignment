package Assignment1_17._08;

// 동물 클래스(Ver.2) 사용 예
public class AnimalTester1 {
	public static void main(String[] args) {
		
		// 추상 클래스는 인터페이스화 불가
//		Animal x = new Animal();
		
		Animal[] a = new Animal[2];
		a[0] = new Dog("뭉치","치와와");
		a[1] = new Cat("마이클",7);
		
		for(Animal s : a) {
			System.out.print(s.getName()+" ");
			s.bark();
			System.out.println();
		}
	}			
}
