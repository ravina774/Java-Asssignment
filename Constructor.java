class Employee{
	int id;
	String name;
	float salary;
	Employee(int a, float s , String n){
		id = a;
		name = n;
		salary = s;
	}
	void display(){
		System.out.println("Employee id = "+id );
		System.out.println("Employee Name = "+name);
		System.out.println("Employee salary = "+salary);
	}
}
class Constructor{
	public static void main(String args[]){
		Employee e = new Employee(101,30000,"Anil");
		e.display();
	}
}