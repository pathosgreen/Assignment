package Assignment2_01;
// Math로 메소드 7종류 출력
public class Assignment2_01_5 {
	public static void main(String[] args) {
		
		// 101.1 반올림
		double d1 = Math.round(101.1);
		System.out.println("Math.round(101.1) = "+d1);
		// 101.1 올림
		double d2 = Math.ceil(101.1);
		System.out.println("Math.ceil(101.1) = "+d2);
		// 4의 3제곱
		double d3 = Math.pow(4, 3.0);
		System.out.println("Math.pow(4,3.0) = "+d3);
		// 100 제곱근
		double d4 = Math.sqrt(100);
		System.out.println("Math.sqrt(100) = "+d4);
		// 25,50중 큰 값
		double d5 = Math.max(25,50);
		System.out.println("Math.max(25,50) = "+d5);
		// 25,50중 작은 값
		double d6 = Math.min(25,50);
		System.out.println("Math.min(25,50) = "+d6);
		// 0~1 사이의 랜덤 double 값
		double d7 = Math.random();
		System.out.println("Math.random() = "+d7);
	}
}
