package Assignment1_21._2;

import java.util.Scanner;

public class RangeErrorTester {
	
	static boolean isValid(int n) {
		return n>=0 && n<=9;
	}
	
	static int add(int a, int b) throws ParameterRangeError, ResultRangeError{
		if(!isValid(a)) throw new ParameterRangeError(a);
		if(!isValid(b)) throw new ParameterRangeError(b);
		int result = a + b;
		if(!isValid(result)) throw new ParameterRangeError(result);
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 a : "); int a = sc.nextInt();
		System.out.print("정수 b : "); int b = sc.nextInt();
		
		try {
			System.out.println("합은 "+add(a, b)+"입니다.");
		} catch (RangeError e) {
			System.out.println("범위 밖 에러가 발생했습니다.\n"+e.getMessage());
		}
	}
}
