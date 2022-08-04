abstract class Abst1 {
    int a,b;
	abstract void add();
	void print(){
	 System.out.println("I am non-abstract method");
}
}
class Abst2 extends Abst1{
    void add()
	{
	a=10;
	b=20;
	a+=b;
	 System.out.println("I am abstract method = " +a );
}
}
class Abst_cls1 {
    public static void main(String[] args){
	Abst2 a = new Abst2();
	a.add();
	a.print();
    }
}