class Overr{
    public static void main(String[] args){
	Sub s = new Sub(10,20);
	s.display();
    }
}
class Super{

	int x;
	Super(int x)
        {
	  this.x=x;	
    	}
	void display()
	 {
	  System.out.println("value of x = "+x);	
    }	
    }
class Sub extends Super{

	int y;
	Sub(int x,int y)
        {
	 super(x);
	  this.y=y;	
    	}
	void display()
	 {
	super.display();
	  System.out.println("value of y = "+y);	
    }
	
    }