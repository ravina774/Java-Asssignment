class A{
	int a,b;
	void getdata()
	{
		a=80;
		b=5;
		System.out.println("value of a = "+a);
		System.out.println("value of b = "+b);
	}
}
class B extends A{
	void sum(){
		a+=b;
		System.out.println("The value of a+b = "+a);
	}
	void sub(){
		a-=b;
		System.out.println("The value of a-b = "+a);
	} 
}
class C extends A{
	void mul(){
		a =a*b;
		System.out.println("The value of a*b = "+a);
	}
	
}
class Heirarchical_inheritance{
	public static void main(String args[]){
	B obj = new B();
	C obj1 = new C();
	obj.getdata();
	obj.sum();
	obj.sub();
	obj1.getdata();
	obj1.mul();
	}
}