package Assignment1_11;

import java.util.Scanner;

public class arrayClone {

	static int[] arrayClone(int[] a) {
		int[] c = new int[a.length];
		for(int i=0;i<c.length;i++)
			c[i]=a[i];
		return c;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x["+i+"] : ");
			x[i]= sc.nextInt();
		}
		
		int[] y = arrayClone(x);
		System.out.println("배열 x를 복사해서 배열 y를 생성했습니다.");
		for(int i=0; i<num;i++)
			System.out.println("y["+i+"] = "+y[i]);
		
	}
}
