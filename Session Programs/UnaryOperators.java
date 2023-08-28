class UnaryOperators{
	public static void main(String args[]){
	
	int a=10,b=20,c;
	System.out.println("a="+a);
	System.out.println("b="+b);

	System.out.println("Pre & Post increament----------");
	c=(a++ + ++a +a++);
	System.out.println(c);

\\	System.out.println("Pre & Post Decreament----------");
\\	c=(a-- + --a - a--);
\\	System.out.println(c);

	int num=70;
	boolean status=true;

	System.out.println(~num);
	System.out.println(!status);
}
}