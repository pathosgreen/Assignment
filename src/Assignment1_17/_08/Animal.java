package Assignment1_17._08;
// 동물 클래스 (Ver.1)
abstract class Animal {
	
	private String name;
	
	public Animal(String name) {this.name = name;}
	public abstract void bark();
	public String getName() {return name;}
}
