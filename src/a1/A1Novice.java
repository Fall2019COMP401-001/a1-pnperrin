package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
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
			
			//fill name arrays
			first_n[i] = scan.next();
			last_n[i] = scan.next();
			
			//get the number of items
			number_items = scan.nextInt();
			
			//get quantity/individual cost and total cost
			for(int j = 0; j < number_items; j++) {
				quantity = scan.nextInt();
				nope = scan.next();
				cost = scan.nextDouble();
				totals[i] += quantity*cost;
				}
			}
		
		//print each customer and their total
		for(int i = 0; i < count; i++)
			System.out.println(first_n[i].charAt(0)+". " + last_n[i] + ": " + String.format("%.2f", totals[i]));
		
		scan.close();
		
	}		
}
