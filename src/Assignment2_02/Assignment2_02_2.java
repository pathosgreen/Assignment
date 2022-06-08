package Assignment2_02;
// 등비수열,등차수열을 사용해 다음과 같이 출력
public class Assignment2_02_2 {
	public static void main(String[] args) {
		
		// 등비수열
		int x=1;
		for(int i=0;i<5;i++) {
			System.out.print(x+" ");
			x=x*2;
		}
		System.out.println();
		int y=250;
		for(int i=0;i<5;i++) {
			System.out.print(y+" ");
			y-=50;
		}
	}
}
