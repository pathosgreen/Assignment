package Assignment2_07;

public class Assignment2_07_1 {
	public static void main(String[] args) {
		//x^2+y^2=z^2를 만족시키는 정수 x,y,z 찾기
		
		for(int z=1;z<100;z++) {
			for(int y=1;y<100;y++) {
				for(int x=1;x<100;x++) {
					if(z>x&&y>x&&z>y&&z*z==x*x+y*y) {
						System.out.println("피타고라스 수 : x= "+x+" y="+y+" z="+z);
					}
				}
			}
		}
		printPita(100);
	}
	
	public static boolean isPita(int x,int y,int z) {
		boolean isP = false;
		if(x*x==y*y+z*z) {
			isP = true;
		}
		return isP;
	}
	
	public static boolean isLarge(int x,int y,int z) {
		boolean isP = false;
		if(z>x&&y>x&&z>y) {
			isP = true;
		}
		return isP;
	}
	
	public static void printPita(int n) {
		for(int z=1;z<n;z++) {
			for(int y=1;y<n;y++) {
				for(int x=1;x<n;x++) {
					if(isLarge(x, y, z)&&isPita(z, y, x)) {
						System.out.println("피타고라스 수 : x= "+x+" y="+y+" z="+z);
					}
				}
			}
		}
	}
}
