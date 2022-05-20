package Assignment1_10;

import java.util.Random;
import java.util.Scanner;

public class Assignment1_10_06 {
	
	static int random(int a,int b) {
		if(b <= a)
			return a;
		else {
			Random rand = new Random();
			return a + rand.nextInt(b-a+1);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("난수를 생성합니다.");
		System.out.print("하한값 : "); int min = sc.nextInt();
		System.out.print("상한값 : "); int max = sc.nextInt();
		
		System.out.println("생성한 난수는 "+random(min, max)+"입니다.");
	}
	
}
