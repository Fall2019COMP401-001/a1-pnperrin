package a1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) { // throws FileNotFoundException {
		
		//File text = new File("src/a1/text.txt");
		Scanner scan = new Scanner(System.in);

				
		//create hashmap
		//HashMap<String, Double> map = new HashMap<String, Double>();
		
		//declare variables
		int count_items;
		int count_people;
		int count_purchase;
		double tmp;
		String nope_l;
		String nope_f;
		String item;
		int quantity;
		
		//get the number of items
		count_items = scan.nextInt();
		
		//make an array for the items/number of customers/number of items bought
		String[] items = new String[count_items];
		int[] number_customer = new int[count_items];
		int[] number_items = new int[count_items];
		
		//put items in array
		for (int i = 0; i < count_items; i++) {
			items[i] = scan.next();
			tmp = scan.nextDouble();
		}
		
		//loop through number of customers and their purchase
		count_people = scan.nextInt();
		
		//for the number of customers roll through purchase
		for (int i = 0; i < count_people; i++) {
			nope_f = scan.next();
			nope_l = scan.next();
			
			count_purchase = scan.nextInt();
			
			for (int j = 0; j < count_purchase; j++) {
				
				quantity = scan.nextInt();
				item = scan.next();
				
				for (int z = 0; z < items.length; z++) {
					if(item.equals(items[z])) {
						number_customer[z]++;
						number_items[z] += quantity;
					}
				}
			}
		}
		for(int i = 0; i < items.length; i++) {
			if(number_customer[i] == 0) {
				System.out.println("No customers bought " + items[i]);
			} else {
				System.out.println(number_customer[i] + " customers bought " + number_items[i] + " " + items[i]);
			}
		}
	}
}
