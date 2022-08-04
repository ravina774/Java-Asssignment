abstract class Bike {
	
	abstract void print();
	 public static void main(String[] args){
        System.out.println("hello ravina");
	Abst_cls  a=new Abst_cls ();
	a.print();
	
    }
   
}
class Abst_cls extends Bike {

	void print(){
	System.out.println("hello abstract method");
	
}

   
}
