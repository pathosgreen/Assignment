package Assignment1_09;

import java.util.Scanner;

public class Assignment1_09_06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int number = 6;
		int[][] point = new int[number][2];
		int[] sumStudent = new int[number];
		int[] sumSubject = new int[2];
		
		System.out.printf("%d명의 국어,수학 점수를 입력하세요.\n",number);
		
		for(int i=0;i<number;i++) {
			System.out.printf("%2d번 국어: ",i+1);
			point[i][0] = sc.nextInt();
			System.out.printf("%2d번 수학: ",i+1);
			point[i][1] = sc.nextInt();
			
			sumStudent[i] = point[i][0]+point[i][1];
			sumSubject[0] += point[i][0];
			sumSubject[1] += point[i][1];
		}
		
		System.out.println("No. 국어,수학 평균");
		for(int i=0;i<number;i++) 
			System.out.printf("%2d%6d%6d%6.1f\n",i+1,
					point[i][0],point[i][1],(double)sumStudent[i]/2);
			System.out.printf("평균%6.1f%6.1f\n",(double)sumStudent[0]/number,
					(double)sumStudent[1]/number);
		
	}
}
