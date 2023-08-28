 // lang, io Auto import
  import java.util.Scanner;
 
 class InputDemo
 {	 public static void main(String args[])
	 {
		 Scanner sc = new Scanner(System.in);		 
		 // int input
		 System.out.println("Enter number 1:");
		int num1= sc.nextInt();
		System.out.println("Enter number 2:");
		int num2= sc.nextInt();
		int result= num1+ num2;
		System.out.println("Result is :"+result);
		System.out.println("Enter Marks:");
		float marks= sc.nextFloat();
		System.out.println("Enter Weight:");
	   double weight= sc.nextDouble();
	   System.out.println("Enter status");
		boolean status= sc.nextBoolean();
	      // short s1= sc.nextShort();
      // long l1= sc.nextLong();
     // byte b1= sc.nextByte();
	 // String s1= sc.next();  // without spaces
	 // char c= sc.next().charAt(0);
	}
}
 