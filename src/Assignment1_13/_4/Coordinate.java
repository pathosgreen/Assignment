package Assignment1_13._4;

public class Coordinate {
	
	private double x; // x좌표
	private double y; // y좌표
	
	Coordinate(double x,double y){this.x = x; this.y = y;}
	
	double getX() { return x;}
	double getY() { return y;}
	
	void set(double x,double y) {this.x = x; this.y = y;}
}
