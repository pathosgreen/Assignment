package Assignment1_17._09;
// 동물 클래스 (Ver.2)
abstract class Animal {
	
	private String name;
	public Animal(String name) {this.name = name;}
	public abstract void bark();
	public String getName() {return name;}
	public abstract String toString();
	public void introduce() {
		System.out.print(toString()+"이다.");
		bark();
	}
}
