class Constructer
{
	public static void main(String args[])
	{
		
		
		Cons c1 =new Cons(10);
		c1.display();
		Cons c2=new Cons();
		c2.display();
	}
	
	
	
}
class Cons
{
	int l,w;
	Cons()
	{
		System.out.println("dflt const");
	}
 	
	Cons(int a)
	{
		l=a;
		System.out.println("arg const");
		
	}

	public void display()
	{
		
		System.out.println("my name ravina");
		
	}
}		