package Assignment2_03;

import java.util.Scanner;

// 10진수 -> 이진수 변환
public class Assignment2_03_1d {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("변환할 숫자 : ");
		int ten = sc.nextInt();
		
		System.out.println("입력값 : "+ten);
		int i;
		int t = ten;
		for(i=0;t>=1;i++) {
			t=t/2;
		}
		int[] two = new int[i];
		for(int j=0;ten>=1;j++) {
			if(ten%2==1) {
				two[j]=1;
			}else {
				two[j]=0;
			}
			ten=ten/2;
		}
		System.out.print("이진수 값 : ");
		
		for(int j=1;j<=i;j++) {
			System.out.print(two[i-j]);
		}
		

	}
}
