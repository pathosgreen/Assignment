package Assignment1_11;

import java.util.Scanner;

public class minOfHeightWeight {
	
	static int minOf(int[] a) {
		int min = a[0];
		for(int i=1;i<a.length;i++)
			if(a[i]<min)
				min=a[i];
		return min;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사람 수 : ");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		int[] weight = new int[num];
		
		System.out.println(num + "명의 신장과 체중 입력 ");
		for(int i=0;i<num;i++) {
			System.out.print((i+1)+"번의 신장 : ");
			height[i] = sc.nextInt();
			System.out.print((i+1)+"번의 체중 : ");
			weight[i] = sc.nextInt();
		}
		
		System.out.println("키가 가장 작은 사람의 신장 : "+minOf(height)+"cm");
		System.out.println("가장 마른 사람의 체중 : "+minOf(weight)+"kg");
	}
}
