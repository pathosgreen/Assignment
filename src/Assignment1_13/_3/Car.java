package Assignment1_13._3;

public class Car {
	
	private String name;	// 이름
	private String number;	// 번호
	private int width;		// 폭
	private int height;		// 높이
	private int weight;		// 길이
	private double x;		// 현재 위치의 x좌표
	private double y;		// 현재 위치의 y좌표
	private double tankage;	// 탱크 용량
	private double fuel;	// 남은 연료
	private double sfc;		// 연비
	
	// 생성자
	public Car(String name, String number, int width, int height, int weight, double tankage,
			double fuel, double sfc) {
		this.name = name;		this.number = number;		this.width = width;
		this.height = height;		this.weight = weight;		this.tankage = tankage;
		// 남은 연료의 최대값은 탱크 용량과 동일
		this.fuel = (fuel <= tankage) ? fuel : tankage;
		this.sfc = sfc; x=y=0.0;
	}
	
	double getX() {return x;}
	double getY() {return y;}
	double getFuel() {return fuel;}
	
	void putSpec() {
		System.out.println("이름 : "+ name);
		System.out.println("번호 : "+ number);
		System.out.println("전폭 : "+ width+"mm");
		System.out.println("전고 : "+ height+"mm");
		System.out.println("전장 : "+ weight+"mm");
		System.out.println("탱크 : "+ tankage+"리터");
		System.out.println("연비 : "+ sfc+"km/리터");
	}
	
	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx*dx+dy*dy); // 이동거리
		double f =dist/sfc;
		
		if(f>fuel)
			return false;	// 연료 부족 = 이동불가
		else {
			fuel -= f;		// 이동 거리만큼 연료 소모
			x += dx;
			y += dy;
			return true;
		}
	}
	
	void refuel(double df) {
		if( df > 0) {
			fuel += df;
			if(fuel > tankage)
				fuel = tankage;
		}
	}
}
