package Day_6_Break_Continue;

public class Break {

	public static void main(String[] args) 
	{
		System.out.println("Difference in o/p changing order");
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			if(i==5)
			break;
		}
		System.out.println("\n");
		for(int j=0;j<=10;j++)
		{
			
			if(j==5)
			break;
			System.out.println(j);
		}
	}

}
