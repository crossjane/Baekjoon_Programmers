import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] inputArr = new int[N];
		
		for(int i = 0; i < N; i++) {
			inputArr[i] = sc.nextInt();
		}
 		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < N; i++ ) {
			if(inputArr[i] > max) {
				max = inputArr[i];
				
			} 
		}
		
		for(int i = 0; i < N; i++ ) {
			
		if(inputArr[i] < min) {
				min = inputArr[i];
				
			}
		}
		System.out.println(min + " "+max);
		
	}	
}


