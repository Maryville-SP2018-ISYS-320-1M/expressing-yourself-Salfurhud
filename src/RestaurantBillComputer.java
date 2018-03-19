/*
  	ISYS 320
  	Name(s):AlfurhudSolomon
  	Date: March18,2018
*/

public class RestaurantBillComputer {

	
	public static void main(String[] args) {
		double[] tips = {15, 18, 20};
		double bill = 20;

		
		for(int i = 0; i < tips.length; i++) {
			double total = (bill * (tips[i] / 100)) + (0.05 * bill) + bill;

			
			System.out.println("With a " + tips[i] + "% tip your total would be $" + total);

			
		}
	}

}

