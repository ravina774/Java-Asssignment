  class Rev
{
		
	public static void main(String args[])
	{
		int rev=0,rem,num;
		num = Integer.parseInt(args[0]);
		while(num!=0)
		{	
			rem = num%10;
			rev = rev*10+rem;
			num=num/10;
			
		}
	
		System.out.println("Reverse number = " +rev);
		
	}
	
}	