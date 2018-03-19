/*
  	ISYS 320
  	Name(s):AlfurhudSolomon
  	Date: March18,2018
*/

public class ComputePay {
	public static void main(String[] args) {
		
		int hrsWorked = 4 + 5 + 8 + 4;
		double hrlySalary = 8.75;
		
		System.out.println("My total hours worked:");
		System.out.println(hrsWorked);
		
		System.out.println("My hourly salary:");
		System.out.println("$" + hrlySalary);
		
		System.out.println("My total pay:");
		System.out.println( hrsWorked * hrlySalary );
		
	}
}