package Assignment1_13._2;

public class Humen {
	
	String name; // 이름
	int height; // 신장
	int weight; // 체중
	
	Humen(String n,int h,int w) {
		name=n;height=h;weight=w;
	}
	
	String getName() { return name;}
	int getHeight() { return height;}
	int getWeight() { return weight;}
	
	void gainWeight(int w) { weight+=w;}
	void reduceWeight(int w) { weight-=w;}
}