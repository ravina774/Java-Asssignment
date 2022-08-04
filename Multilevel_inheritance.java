class Person{
	String name;
	int age;
	void getp(){
		name = "Mohit";
		age = 16;
	}

}
class Student extends Person{
	int roll_num,cls;
	void gets(){
	roll_num = 121;
	cls = 10;	
	}
}
class Show_dtls extends Student{
	void display(){
	System.out.println("Name = "+name);
	System.out.println("Age = "+age);
	System.out.println("Roll number = "+roll_num);
	System.out.println("class = "+cls);
	}
}
class Multilevel_inheritance
{
	public static void main(String args[]){
		Show_dtls s = new Show_dtls();
		s.getp();
		s.gets();
		s.display();
	}
}
