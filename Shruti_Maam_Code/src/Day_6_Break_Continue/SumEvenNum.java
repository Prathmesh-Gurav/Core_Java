package Day_6_Break_Continue;

public class SumEvenNum {

	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<=20;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
			
		}
		System.out.println("Sum of even numbers is :"+sum);

	}

}
