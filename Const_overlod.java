class ABC{
	int x,y;
	ABC(){
		x=y=0;
	}

	ABC(int a){
		x=y=a;
	}
	ABC(int a , int b){
		x=a;
		y=b;
	}
	void display(){
		System.out.println("x = "+x+ " and y = "+y);
	}
}
class Const_overlod{
	public static void main(String args[]){
	ABC obj1 = new ABC();
	ABC obj2 = new ABC(10);
	ABC obj3 = new ABC(10,20);
	obj1.display();
	obj2.display();
	obj3.display();
	}
}