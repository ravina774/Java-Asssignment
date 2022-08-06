class Sample{
    public static void main(String[] args){
	int a=10, b=5 , c =5;
	int x,y;
	try{
		x=10/(b-c);

	}
	catch(ArithmeticException e){
		System.out.println("divided by zero");
	}
	y=a/(b+c);
	System.out.println("value of y = "+y);
    }
}