package dayy13_Pattern;

public class pr7 
{
	public static void main(String[] args)
	{
		int num=1;
		for(int i=1; i<=3; i++)
		{
			for(int j=1; j<=3; j++)
			{
				if(num%2==1)
				{
					System.out.print((num*num)+" ");
					num++;
				}
				else
				{
					System.out.print(num+" ");
					num++;
				}
			}
			System.out.println("");
		}
	}
}

//1 2 9 
//4 25 6 
//49 8 81 

