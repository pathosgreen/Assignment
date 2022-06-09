package Assignment2_03;

public class Assignment2_03_3 {
	public static void main(String[] args) {
		
		int x=0;
		int y=0;
		System.out.print("전위연산> ");
		for(int i=0;i<10;i++) {
			System.out.print("x="+(++x)+" ");
		}
		System.out.println();
		System.out.print("후위연산> ");
		for(int i=0;i<10;i++) {
			System.out.print("y="+(y++)+" ");
		}
	}
}
