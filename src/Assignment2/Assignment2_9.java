package Assignment2;

import java.util.Random;

public class Assignment2_9 {
	public static void main(String[] args) {
		// 0,1,2 난수로 0=가위 1=바위 2=보 출력
		Random random = new Random();
		int ran = random.nextInt(3);
		
		System.out.println(" 값 : " + ran);
		switch(ran) {
		case 0: System.out.println(" 가위"); break;
		case 1: System.out.println(" 바위"); break;
		case 2: System.out.println(" 보");
		}
		
		
	}
}