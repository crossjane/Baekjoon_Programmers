import java.util.Scanner;

public class Main {
	   public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);


	int K = sc.nextInt();
	int N = sc.nextInt();
	int M = sc.nextInt();
	
	int totalPrice = (K * N);
	
	if(totalPrice >= M ) {
		
		System.out.println(totalPrice - M );
		
	}else {
		System.out.println(0);
	}

	
   }
	   
	   
	   
}
