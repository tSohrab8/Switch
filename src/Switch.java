import java.util.*;

public class Switch {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of days in the month");
		int days = scan.nextInt();
		
		switch(days){
			
			case 28: System.out.println("February (Non Leap Year)"); break;
			case 29: System.out.println("February (Leap Year)"); break;
			case 30: System.out.println("April,June,September,November"); break;
			case 31: System.out.println("January, March, May, July, August, October, December"); break;
			
			default: System.out.println("No months have " + days + " days"); break;
		
		
		}
	}

}
