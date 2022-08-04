class Evan{
	void display(){
	System.out.println("Evan number = 2,4");
	}
}
class Odd extends Evan
{
	void display(){
	super.display();
	System.out.println("Odd number = 1,3");
	}
}
class Single_inheritance
{
	public static void main(String args[]){
	Odd o = new Odd();
	o.display();
} 
}  