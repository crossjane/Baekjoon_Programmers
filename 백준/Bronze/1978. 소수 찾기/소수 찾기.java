import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int decimalCnt = 0; 
		
		for(int i = 0; i <N  ; i++) {	
			int number = sc.nextInt();
			int divisorCount = 0; 
			
			if(number > 1 ) {
				for(int j =2; j <= number; j++) {
					if(number %j == 0) {
						divisorCount++;
					}
				}
				
				if(divisorCount ==1) {
					decimalCnt++; 
				}
			}
		}
		

		System.out.println(decimalCnt);
	
	
	}
	
}
	