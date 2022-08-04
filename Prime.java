class Prime
{
		
	public static void main(String args[])
	{
		int num,i,j,num1,num2;

		num1=Integer.parseInt(args[0]);
		num2=Integer.parseInt(args[1]);
	for(j=num1;j<=num2;j++)
	{		    
		num =j;	
		
		for(i=2;i<num;i++)
		{		    
			if(num%i==0)
			{
			break;
			}
		}
		if(num==i)
		{
		System.out.println( num + " is a prime number ");
		
		}
		
		
	}	

		
	}
	
}