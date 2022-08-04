class Loop
{
	public static void main(String args[])
	{
		System.out.println("Using loop");
		for(int i=0;i<=36;i++)
		{
			System.out.println(i);
		}
		System.out.println("fibonacci series");
		int f1=0;
		int f2=1;
		int f3,count =3;
		f3=f1+f2;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		while(count <= 10)
		{
			f1=f2;
			f2=f3;
			f3=f1+f2;
			System.out.println(f3);
			count++;
		}
	}

}