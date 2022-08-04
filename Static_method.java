class Demo
{
	static int num=10;
	static String str = "java";
	//This is static method
	static void display()
	{
		System.out.println("Static number is = "+num);
		System.out.println("Static string is = "+str);
	}
	void nonstatic(){
	//All static method can accessed
	//in nonstatic method
	display();
	}
}
class Static_method
{
	public static void main(String args[]) {
	Demo d = new Demo();
        
        // This is object to call non static function
        d.nonstatic();
        
        // static method can called 
        Demo.display();
	}
}