interface  A {
	void print();
	 
}
interface  B {
	void show();
	 

}
class Ab implements A,B{
    public void print()
	{
	
System.out.println("I am print method");
	
}
public void show()
	{
	
System.out.println("I am show method");
}
}
class Interf {
    public static void main(String[] args){
	Ab a = new Ab();
	a.show();
	a.print();
    }
}