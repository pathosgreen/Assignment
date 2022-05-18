package Assignment1_08;

import java.util.Random;
import java.util.Scanner;

public class Assignment1_08_07 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int n = scan.nextInt();
		int[] a = new int[n];
		
		for(int i=0;i<n;i++) {
			int j;
			do {
				j=0;
				a[i]= 1+rand.nextInt(10);
				for(;j<i;j++)
					if(a[j]==a[i]) break;
			}while(j<i);
		}
		for(int i=0;i<n;i++)
			System.out.println("a["+i+"] = "+a[i]);
	}
}
