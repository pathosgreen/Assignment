package Assignment2_07;
// clone을 이용한 배열 복사
public class Assignment2_07_5 implements Cloneable { // Cloneable을 implements 해야 clone이 가능
	public static void main(String[] args) {
		
		int[] a = {8,5,2,4,6,3,7,9};
		int[] aCl = a.clone(); // a를 aCl로 복사
		
		int[][] b = {{-1,5,6,7},{6,7,8,9}};
		int[][] bCl = b.clone(); // b를 bCl로 복사
		
		plintone(a);
		plintone(aCl);
		System.out.println();
		plinttwo(b);
		plinttwo(bCl);
	}
	
	public static void plintone(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print("["+a[i]+"] ");
		}
		System.out.println();
	}
	public static void plinttwo(int[][] a) {
		for(int i=0;i<a.length;i++) {
			plintone(a[i]);
		}
	}
}
