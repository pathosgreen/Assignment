package Assignment2_07;

public class Assignment2_07_3 {
	public static void main(String[] args) {
		
		int[] a = null; // 선언
		// 정의
		a = new int[5];
		// 초기화
		a[0]=2;a[1]=5;a[2]=3;a[3]=9;a[4]=8;
		// 선언 정의 초기화
		int[] b = new int[] {2,5,3,9,8};
		// 선언 정의 초기화
		int[] c = {2,5,3,9,8};
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		
		int[] d = a;
		a[4] = 55; // a값 변동시 d의 값이 변하는지 확인
		for(int i=0;i<d.length;i++) {
			System.out.print(d[i]+"\t");
		}
		System.out.println();
		int[] e = new int[5];
		System.arraycopy(d, 0, e, 0, d.length);
		d[4] = 100; // d값 변동시 e의 값이 변하는지 확인
		for(int i=0;i<e.length;i++) {
			System.out.print(e[i]+"\t");
		}
	}
}
