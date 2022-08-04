class Adder
{
	
	void add(int a){
	a+=a;
	System.out.println("value of a+a = "+a);
	}
	void add(int a, int b){
	a+=b;
	System.out.println("value of a+b = "+a);
	}
	void add(int a,int b, int c){
	a+=b+c;
	System.out.println("value of a+b+c = "+a);
	}
}
class Overloding{
	public static void main(String args[]){
		Adder a = new Adder();
		a.add(10);
		a.add(10,20);
		a.add(10,20,30);
	}
}