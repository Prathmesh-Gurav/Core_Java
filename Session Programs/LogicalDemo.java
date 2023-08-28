class LogicalDemo
{

  public static void main()
  {
	  int a=10, b=20;
	  
	  System.out.println(a>5 && b<30); // true
	  System.out.println(a>5 && b>30); // false
	  System.out.println(a<5 && b<30); // false
	  System.out.println(a<5 && b>30); // false
	  
	  
	  System.out.println(a>5 || b<30); // true
	  System.out.println(a>5 || b>30); // true
	  System.out.println(a<5 || b<30); // true
	  System.out.println(a<5 || b>30); // false
	  
	  System.out.println(a>5); // true
	  System.out.println(!(a>5)); // false
	
  }
 

}