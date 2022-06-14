package Assignment2_05;

import java.util.Scanner;

public class Assignment2_05_4 {
	
	static void arg(String[] a){
		System.out.println("입력된 값의 수 = "+a.length);
		for(int i=0;i<a.length;i++) {
			System.out.println((i+1)+"번째 값 : "+a[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 값의 수 : ");int po = sc.nextInt();
		String[] a = new String[po];
		for(int i=0;i<po;i++) {
			System.out.print("a["+i+"] : ");
			a[i] = sc.next();
		}
		arg(a);
	}
}
