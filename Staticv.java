class Staticv{
	public static void main(String args[])
	{
		Sample S = new Sample(10);
		S.display();
		Sample.print();
		
	}
		
}
class Sample{
	int a;
	static String clg="gd";	
Sample(int x)
	{
		a=x;
	}
	static void print()
	{	
		clg = "gdsdmkl";
		
		System.out.println(clg+"value of a =");
	}
	void display()
	{	
		
		
		System.out.println(clg+"value of a =" +a);
	}
		
}