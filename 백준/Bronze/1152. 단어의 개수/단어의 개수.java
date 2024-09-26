import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	   public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	String sentence = sc.nextLine().trim();
	
	
	ArrayList<String> words = new ArrayList<>();
	
	String[] splitWords = sentence.split(" ");
	for(String word: splitWords) {
		if(!word.isEmpty()) {
			words.add(word);
		}
		
			
	
	}	
	
	System.out.println(words.size());
   }
	   
	   
}
