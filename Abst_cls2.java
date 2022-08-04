abstract class  Abst1{
    	
	int a,b;
	abstract void add();
	abstract void sub();
    
}
class Abst2 extends Abst1 {
	
    	void add()
	{
	a=10;
	b=20;
	a=a+b;
        System.out.println("total value of a+b =  " +a);
    	}
	void sub()
	{
	
	a=a-b;
        System.out.println("total value of a-b =  " +a);
    	}
}
class  Abst_cls2{
    	
	public static void main(String[] args){
	Abst2 a =  new Abst2();
	a.add();
	a.sub();
       
    }
}
