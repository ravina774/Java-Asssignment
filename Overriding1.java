class Overriding1{
	public static void main(String args[])
	{
		Sub S = new Sub(10,20);
		S.display();
		
	}
}
class Super{
	int a;
	Super(int x)
	{
		a=x;
	}
	void display()
	{
		System.out.println("value of a =" +a);
	}
		
}
class Sub extends Super{
	int b;
	Sub(int x,int y){	
		super(x);
		b=y;
}
	void display()
	{
		System.out.println("value of a =" +a);
		System.out.println("value of b =" +b);
	}
}