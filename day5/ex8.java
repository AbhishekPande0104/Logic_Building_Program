package day5;

public class ex8 
{
	public static void main(String[] args)
	{
		int n=963;
		int rem;
		int mul=1;
		
		while(n!=0)
		{
			rem=n%10;
			mul=mul*rem;
			n=n/10;
		}
		System.out.println(mul);
	}
}
