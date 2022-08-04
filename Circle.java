class Circle {

		double r,p;
		
		double getarea()
		{
			r = 6;
		 	p = 3.14;
			return (p*r*r);
		}
		void printinfo()
		{
			System.out.println("value of area = " + getarea());
			System.out.println("value of radius = " + r);
		}
    
public static void main(String[] args){
		

	Circle c1 = new Circle();
	c1.getarea();
	c1.printinfo();		
        
    }
}