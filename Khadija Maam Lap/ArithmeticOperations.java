import java.util.Scanner;
class ArithmeticOperations{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of a=");
	int a = sc.nextInt();

	System.out.println("Enter value of b=");
	int b = sc.nextInt();

	System.out.println("1.Addition="+(a+b));
	System.out.println("2.Substration="+(a-b));
	System.out.println("3.Multiplication="+(a*b));
	System.out.println("4.Division="+(a/b));
	System.out.println("5.Modulus="+(a%b));			
}
}