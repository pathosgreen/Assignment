package Assignment1_15._2;
// Ver.2
public class Id {
	
	private static int counter = 0;
	private int id;
	
	public Id() {
		id = ++counter;
	}

	public int getId() {return id;}
	
	public static int getMaxId() {
		return counter;
	}
}
