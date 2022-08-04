
class Income1
{
	public static void main(String arg[])
	{
		double tax = 0;
		int incame = 1000000;
		if(incame <= 500000)
		tax=0;
		else if(incame >= 500000)
		tax=(incame-500000)*5/100;
		else if(incame  > 800000  && incame <= 1200000)
		tax=(incame-800000)*10/100+15000;
		else if(incame > 1200000 && incame <= 1500000)
		tax=(incame-1200000)*15/100+30000;
		System.out.println(tax + "tax on incame " + incame);
	}
}