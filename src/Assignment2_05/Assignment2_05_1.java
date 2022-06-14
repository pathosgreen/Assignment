package Assignment2_05;

public class Assignment2_05_1 {
	public static void main(String[] args) {
		
		int i=1;
		boolean more = true;
		while(true) {
			if(i%2==0 && more == true) {
				System.out.print(i+" ");
			}

			if(i%2==1 && more == false) {
				System.out.print(i+" ");
			}
			i++;
			if(i>10 && more == true) {
				i=1;more = false;
				System.out.println("\n");
			}else if(i>10 && more == false) {
				break;
			}
		}
	}
}
