import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	   public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);


	String input[] = new String[5];
	
	for(int i = 0; i < 5; i++) {
	  input[i] = sc.nextLine();
	  
	}
	
	
	for(int col = 0; col < 15; col++) {
		for(int row = 0; row < 5; row++) {
			
			if(col < input[row].length()) {
			System.out.print(input[row].substring(col,col+1));
			
			}
			
		}	
		
	}
		
		
	
   }
	   
}