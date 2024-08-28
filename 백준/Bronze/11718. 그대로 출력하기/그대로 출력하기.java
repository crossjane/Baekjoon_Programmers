import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	        for(int i = 0; i < 100 && sc.hasNextLine(); i++) {
	            String text = sc.nextLine();
	            System.out.println(text); 
	        }
	    }
		
		
	
	}
