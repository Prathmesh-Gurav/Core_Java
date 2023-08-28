import java.io.*;
class Compound_Interest
{
	public static void main(String args[])
{
	double compound_interest,principal,rate_of_interest,time;

	principal=24589f;
	time=6;
	rate_of_interest=3.5;

	compound_interest=principal*(Math.pow(1*rate_of_interest/100,2.0));

	System.out.println("Compound Interest="+compound_interest);
	
}
}