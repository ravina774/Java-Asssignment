class Circle{
	double p,r,setarea;
	void getarea(){
		p=3.14;
		r=2.5;
		setarea=p*r*r;
	System.out.println("area of circle = "+setarea);
	}
	
}
class Rectangle{
	double width,height,setarea;
	void getarea()    
	{
		width = 25.5;
		height = 15.5;
		setarea = width*height;
	System.out.println("area of Rectangle  = "+setarea);
	}
}
class Square{
	double width,setarea;
	void getarea(){
	width = 20.5;
	setarea = width*width;
	System.out.println("area of Square  = "+setarea);
	}
}
class Main_class{
	public static void main(String  args[]){
	Circle c = new Circle();
	Rectangle r = new Rectangle();
	Square s =new Square();
	c.getarea();
	r.getarea();
	s.getarea();	
}
}