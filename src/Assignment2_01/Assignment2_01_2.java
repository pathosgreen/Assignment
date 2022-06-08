package Assignment2_01;
// 강제형변환 4가지 만들고 출력
public class Assignment2_01_2 {
	public static void main(String[] args) {
		
		// double 타입 변수를 float 타입으로 강제변환
		double doubleType = 101.101;
		float floatType;
		floatType = (float) doubleType;
		System.out.println("floatType = "+floatType);
		
		// long 타입 변수를 int 타입으로 강제변환
		long longType = 1000;
		int intType = (int)longType;
		System.out.println("intType = "+intType);
		
		// int 타입 변수를 short 타입으로 강제변환
		short shortType = (short) intType;
		System.out.println("shortType = "+shortType);
		
		// short 타입 변수를 byte 타입으로 강제변환(오버플로우로 값이 오류남)
		byte byteType = (byte) shortType;
		System.out.println("byteType = "+byteType);
		
	}
}
