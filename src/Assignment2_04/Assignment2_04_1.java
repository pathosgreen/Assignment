package Assignment2_04;

import java.util.Scanner;

public class Assignment2_04_1 {
	

	// a값 받기
	public static int[] pointUp() {
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for(int i=0;i<a.length;i++) {
			System.out.print("a["+i+"]의 값 : ");
			a[i] = sc.nextInt();
		}
		sc.close();
		return a;
	}
	public static int max(int[] a) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		return max;
	}
	public static int min(int[] a) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		return min;
	}
	public static int mid(int[] a) {
		int t;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					t = a[i]; a[i] = a[j]; a[j] = t;
				}
			}
		}
		int mid = (a[4]+a[5])/2;
		return mid;
	}
	
	public static void main(String[] args) {
		
		int[] a = pointUp();
		
		System.out.println("최댓값 = "+max(a));
		System.out.println("최솟값 = "+min(a));
		System.out.println("중간값 = "+mid(a));
		
	}
}
