package Assignment1_11;

import java.util.Scanner;

public class Setbit2 {

	static void printBits(int x) {
		for(int i=31;i>=0; i--)
			System.out.print(((x >>> i & 1) == 1 )? '1' : '0');
	}
	
	static int set(int x, int pos, int n) {
		return x | (~(~0 << n) << pos);
	}
	
	static int reset(int x, int pos, int n) {
		return x & ~(~(~0 << n) << pos);
	}
	
	static int inverse(int x, int pos, int n) {
		return x ^(~(~0 << n) << pos);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 x의 pos번째 비트부터 n개 변경");
		System.out.print("x : ");int x = sc.nextInt();
		System.out.print("pos : ");int pos = sc.nextInt();
		System.out.print("n : "); int n = sc.nextInt();
		
		System.out.print("x              = "); printBits(x);
		System.out.print("\nset(x,pos)     = "); printBits(set(x, pos, n));
		System.out.print("\nreset(x,pos)   = "); printBits(reset(x, pos, n));
		System.out.print("\ninverse(x,pos) = "); printBits(inverse(x, pos, n));
		System.out.println();
		
	}

}
