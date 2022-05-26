package Assignment1_14._1;
//사람 클래스 ver.2
public class Human {
	
	// 필드
	private String name; // 이름
	private int height; // 신장
	private int weight; // 체중
	
	// 생성자
	public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	// 메소드
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getHeight() {return height;}
	public void setHeight(int height) {this.height = height;}
	public int getWeight() {return weight;}
	public void setWeight(int weight) {this.weight = weight;}
	
	void gainWeight(int w) {weight += w;}
	void reduceWeight(int w) {weight -= w;}
		
}
