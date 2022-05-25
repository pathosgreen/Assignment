package Assignment1_13._4;

import java.util.Scanner;

public class CoordinateTester2 {
	
	static boolean compCoordinate(Coordinate c1, Coordinate c2) {
		return c1.getX() == c2.getX() && c1.getY() == c2.getY();
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("좌표 p를 입력하세요.");
		System.out.print("X좌표 : "); double px = sc.nextDouble();
		System.out.print("Y좌표 : "); double py = sc.nextDouble();
		Coordinate p = new Coordinate(px, py);
		
		System.out.println("좌표 q를 입력하세요.");
		System.out.print("X좌표 : "); double qx = sc.nextDouble();
		System.out.print("Y좌표 : "); double qy = sc.nextDouble();
		Coordinate q = new Coordinate(qx, qy);
		
		System.out.println((p == q)
				? "p == q 입니다."
				: "p != q 입니다.");
		
		System.out.println((p.getX() == q.getX() &&
							p.getY() == q.getY())
				? "p == q가 같습니다."
				: "p != q가 다릅니다.");
		
		System.out.println(compCoordinate(p, q)
				? "p == q가 같습니다."
				: "p != q가 다릅니다.");
	}
}
