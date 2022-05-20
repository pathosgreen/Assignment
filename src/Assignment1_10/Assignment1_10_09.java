package Assignment1_10;

import java.util.Scanner;

public class Assignment1_10_09 {
	
	static int pow2(int no) {
		int pw = 1;
		while(no-- > 0) 
			pw *= 2;
		return pw;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 x를 n비트 시프트합니다.");
		System.out.print("x : "); int x = sc.nextInt();
		System.out.print("n : "); int n = sc.nextInt();
		
		int mPower = x*pow2(n);
		int dPower = x/pow2(n);
		int lShift = x<<n;
		int rShift = x>>n;
		
		System.out.printf("[a]x*(2의%d승) = %d\n",n,mPower);
		System.out.printf("[b]x/(2의%d승) = %d\n",n,dPower);
		System.out.printf("[c]x<<%d = %d\n",n,lShift);
		System.out.printf("[d]x>>%d = %d\n",n,rShift);
		
		System.out.println("[a]와 [c]의 값이 일치" +
		((mPower == lShift) ? "합니다." : " 하지 않습니다."));
		System.out.println("[b와 [d]의 값이 일치" +
		((dPower == rShift) ? "합니다." : " 하지 않습니다."));
	}
}
