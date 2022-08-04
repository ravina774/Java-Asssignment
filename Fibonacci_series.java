class Fibonacci_series
{
	public static void main(String arg[])
	{
	int num,num1=0,num2=1,i,number=11  ;
	System.out.println("febonacci series  = "+number);
	System.out.print(num1+"  " +num2+"  " );
	for(i=2;i<number;i++)
	{
		num=num1+num2;
		System.out.print(num+ "  ");
		num1=num2;
		num2=num;
		
	}		

	}
}