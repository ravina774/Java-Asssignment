class Bike{
    
	final int speed;
     	 Bike()
	{ speed = 70;}
	 Bike(int a)
	{ speed = a;}
}

class Finexamp {
    public static void main(String[] args){
	Bike b = new Bike();
	Bike b1 = new Bike(10);
       System.out.println("value of speed = "+b.speed);
	System.out.println("value of speed = "+b1.speed);
    }
}
