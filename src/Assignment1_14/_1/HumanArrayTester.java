package Assignment1_14._1;

import java.util.Scanner;

public class HumanArrayTester {
	
	static void printHumenArray(Human[] a) {
		for(int i=0;i<a.length;i++)
			System.out.printf("No.%d %s %3dcm %3dkg\n",
					i,a[i].getName(),a[i].getHeight(),a[i].getWeight());
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		// 1차원 배열
		// 생성과 동시에 초기화
		Human[] p = {
			new Human("길동", 170, 70),
			new Human("철수", 160, 59)
		};
		
		// 배열과 각각의 인스턴스를 개별적으로 생성
		System.out.print("배열 q의 요소 수 : ");
		n = sc.nextInt();
		
		Human[] q = new Human[n];
		for(int i=0;i<q.length;i++) {
			System.out.println("q["+i+"]");
			System.out.print("이름 : "); String name = sc.next();
			System.out.print("신장 : "); int height = sc.nextInt();
			System.out.print("체중 : "); int weight = sc.nextInt();
			q[i] = new Human(name, height, weight);
		}
		
		// 2차원 배열
		// 생성과 동시에 초기화
		Human[][] x = {
				{new Human("김철수",175,52),new Human("김영희",169,60)},
				{new Human("홍길동",178,70),new Human("이철수",172,61)},
				{new Human("이영희",168,59),new Human("김길동",165,59)}
		};
		
		// 배열과 각각의 인스턴스를 개별적으로 생성(불규칙 배열)
		System.out.print("배열 y의 행 수 : ");
		n = sc.nextInt();
		
		Human[][] y = new Human[n][];
		for (int i=0;i<y.length;i++) {
			System.out.print("y["+i+"]의 열 수 : ");
			n = sc.nextInt();
			y[i] = new Human[n];
			for (int j=0;j<y[i].length;j++) {
				System.out.println("y["+i+"]["+j+"]");
				System.out.print("이름 : "); String name = sc.next();
				System.out.print("신장 : "); int height = sc.nextInt();
				System.out.print("체중 : "); int weight = sc.nextInt();
				y[i][j] = new Human(name, height, weight);
			}
		}
		
		// 출력
		// 1차원 배열
		System.out.println("배열 p");
		printHumenArray(p);
		
		System.out.println("배열 q");
		printHumenArray(q);
		
		// 2차원 배열
		System.out.println("배열 x");
		for (int i=0;i<x.length;i++) {
			System.out.printf("%d행\n",i);
			printHumenArray(x[i]);
		}
		
		System.out.println("배열 y");
		for (int i=0;i<y.length;i++) {
			System.out.printf("%d행\n",i);
			printHumenArray(y[i]);
		}
	}
}
