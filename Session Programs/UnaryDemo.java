class UnaryDemo
{
	public static void main(String args[])
	{
		int a=89;
		int b;
		
		b=++a;
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		// ~ tlide : numbers  to make it negate
		// ! - boolean : negate
		
		int num=78;
		boolean status= true;
		
		System.out.println(~num);  // -79
		System.out.println(num);   // 78
        System.out.println(!status); // false
		
		
		int n=0;
		System.out.println(~n); 
		
		
	}
	
	
}