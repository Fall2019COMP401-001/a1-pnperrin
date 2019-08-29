package a1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//format decimal
		DecimalFormat df = new DecimalFormat("##.00");
		
		//declare variables
		String nope;
		int count;
		int number_items;
		double cost;
		double quantity;
		double check;
										
		// count number of customers
		count = scan.nextInt();
			
		//make cost/first name/last name arrays from the number of customers
		double[] totals = new double[count];
		String[] first_n = new String[count];
		String[] last_n = new String[count];
				
		//intitialize all totals to 0
		for(int i = 0; i < count; i++)
			totals[i] = 0;
		
		//fill arrays
		for(int i = 0; i < count; i++) {
			first_n[i] = scan.next();
			last_n[i] = scan.next();
			number_items = scan.nextInt();
			
			for(int j = 0; j < number_items; j++) {
				quantity = scan.nextInt();
				nope = scan.next();
				cost = scan.nextDouble();
				totals[i] += quantity*cost;
				}
			}
				
		for(int i = 0; i < count; i++)
			System.out.println(first_n[i].charAt(0)+". " + last_n[i] + ": " + df.format(totals[i]));
		
		scan.close();
		
	}		
}
