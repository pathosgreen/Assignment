package Assignment1_07;

import java.util.Scanner;

public class Assignment1_07_10 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int n = scan.nextInt();
		int[] a = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("a["+i+"] = ");
			a[i] = scan.nextInt();
		}
		System.out.print("a = {");
		if(n>=2) {
			for(int i=0;i<n-1;i++) {
				System.out.print(a[i]+", ");
			}
		}
		if(n>=1) {
			System.out.print(a[n-1]);
		}
		System.out.println("}");
		
	}
}
