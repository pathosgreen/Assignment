package Assignment1_17._08;

public class Dog extends Animal {
	
	private String type;
	
	public Dog(String name,String type) {
		super(name);this.type = type;
	}
	public void bark() {System.out.println("멍멍!");}
}
