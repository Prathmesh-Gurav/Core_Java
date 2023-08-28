package Day_3_Revision;

import java.util.Scanner;

public class ShoppingBill {

	public static void main(String[] args) {
		/*
		 * int quantity = 50; int price = 10;
		 * 
		 * float bill = quantity * price; System.out.println("Total Bill:" + bill);
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter quatity:");
		int quantity=sc.nextInt();
		
		System.out.println("Enter price:");
		int price=sc.nextInt();
		
		int bill=quantity*price;
		System.out.println("Bill: "+bill);
	}

}
