

import java.util.Scanner;

public class Main {
	   public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	
	
	for(int i= 0; i < 3; i++) {
		int inHour = sc.nextInt();
		int inMin = sc.nextInt();
		int inSec = sc.nextInt();
		
		int outHour = sc.nextInt();
		int outMin = sc.nextInt();
		int outSec = sc.nextInt();
		
		
		
		int inTime  = inHour * 3600 + inMin * 60 + inSec; 
		int outTime = outHour * 3600 +  outMin * 60 + outSec; 
		
		int workTime = outTime - inTime;
		
		int workHour = workTime/ 3600; 
		workTime %= 3600;
		int workMin = workTime /60;
		int workSec = workTime % 60;
		
		System.out.println( workHour+" "+workMin +" "+ workSec);
	}
	
	
   }
	   
	   
	   
}
