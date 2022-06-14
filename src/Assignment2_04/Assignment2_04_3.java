package Assignment2_04;

public class Assignment2_04_3 {
	
	static void doubleForA() {
		for(int i=0;i<10;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void doubleForB() {
		for(int i=0;i<=10;i++) {
			for(int j=0;j<=10-i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		doubleForA();
		doubleForB();
	}
}
