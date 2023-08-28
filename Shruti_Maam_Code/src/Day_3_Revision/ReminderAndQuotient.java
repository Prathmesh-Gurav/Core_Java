package Day_3_Revision;

import java.util.Scanner;

public class ReminderAndQuotient 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int quotient = num1 / num2;
		System.out.println("Quotient=" + quotient);

		int remainder = num1 % num2;
		System.out.println("Remainder=" + remainder);
		
		sc.close();
	}

}
