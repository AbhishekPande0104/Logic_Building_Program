package dayy14_Pattern;

public class pr4 
{
	public static void main(String[] args)
	{
		int n=4;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=(n-i+1); j++)
			{
				System.out.print("3C ");
			}
			System.out.println();
		}
	}
}

//3C 3C 3C 3C 
//3C 3C 3C 
//3C 3C 
//3C 
