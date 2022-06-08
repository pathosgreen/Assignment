package Assignment2_01;
// 문자와 정수의 데이터범위를 증명할 수 있는 프로그램 작성
public class Assignment2_01_3 {
	public static void main(String[] args) {
		
		System.out.println("byte의 범위 : "+Byte.MIN_VALUE+
				"~"+Byte.MAX_VALUE);
		System.out.println();
		
		System.out.println("short의 범위 : "+Short.MIN_VALUE+
				"~"+Short.MAX_VALUE);
		System.out.println();
		
		System.out.println("char의 범위 : "+(int)Character.MIN_VALUE+
				"~"+(int)Character.MAX_VALUE);
		System.out.println();
		
		System.out.println("int의 범위 : "+Integer.MIN_VALUE+
				"~"+Integer.MAX_VALUE);
		System.out.println();
		
		System.out.println("long의 범위 : "+Long.MIN_VALUE+
				"~"+Long.MAX_VALUE);
	}
}
