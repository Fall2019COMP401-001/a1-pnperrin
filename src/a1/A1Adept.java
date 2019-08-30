package a1;

//import java.io.File;
//import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;


public class A1Adept {

	public static void main(String[] args) { //throws FileNotFoundException {
		
		
		//File text = new File("src/a1/text.txt");
		Scanner scan = new Scanner(System.in);
		
		//create hashmap
		HashMap<String, Double> map = new HashMap<String, Double>();
		
		//declare variables
		int count_items;
		int count_people;
		int count_purchase;
		
		count_items = scan.nextInt();
		
		//put values for items and their price in map
		for (int i = 0; i < count_items; i++) {
			map.put(scan.next(), scan.nextDouble());
		}
		
		count_people = scan.nextInt();
		
		//declare names and totals arrays
		double[] totals = new double[count_people];
		String[] first_n = new String[count_people];
		String[] last_n = new String[count_people];
		
		//put names/last names and totals in respective arrays
		for (int i = 0; i < count_people; i++) {
			//Person's names and number of different types of items purchased
			first_n[i] = scan.next();
			last_n[i] = scan.next();
			count_purchase = scan.nextInt();
					
			//calculate total paid for purchase
			for (int j = 0; j < count_purchase; j++) {
				totals[i] += scan.nextInt()*map.get(scan.next());
			}
		}
		//print highest/lowest/average as desired output
		getHighest(totals, first_n, last_n);
		getLowest(totals, first_n, last_n);
		getAverage(totals);
	}
	
	/////////////////////////////////////////////

	/* VOID METHODS */
	
	//find the max amount
	private static void getHighest(double[] totals, String[] first_n, String[] last_n) {
		
		//format decimal
		DecimalFormat df = new DecimalFormat("##.00");

		//local var
		String name;
		double max = totals[0];
		int max_index = 0;
		
		//find max
		for(int i = 0; i < totals.length; i++) {
			if(totals[i] > max) {
				max = totals[i];
				max_index = i;
			}
		}
		//void output
		System.out.println("Biggest: " + first_n[max_index] + " " + last_n[max_index] + " (" + df.format(max) +")");
	}
	
	/////////////////////////////////////////////
	
	//find the min amount
	private static void getLowest(double[] totals, String[] first_n, String[] last_n) {
		
		//format decimal
		DecimalFormat df = new DecimalFormat("##.00");
		
		//local var
		String name;
		double min = totals[0];
		int min_index = 0;
		
		//find min
		for(int i = 0; i < totals.length; i++) {
			if(totals[i] < min) {
				min = totals[i];
				min_index = i;
			}
		}
		//void output
		System.out.println("Smallest: " + first_n[min_index] + " " + last_n[min_index] + " (" + df.format(min) +")");
	}
	
	/////////////////////////////////////////////

	//calculate average
	private static void getAverage(double[] totals) {
		
		//format decimal
		DecimalFormat df = new DecimalFormat("##.00");
		
		//local var
		double total_spent = 0;
		double average;
		
		//calculate total money spent between all customers
		for(int i = 0; i < totals.length; i++)
			total_spent += totals[i];
		
		
		average = total_spent/(double)totals.length;
		
		//void output
		System.out.println("AVERAGE: " + df.format(average));
	}
}
