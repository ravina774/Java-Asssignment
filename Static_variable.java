import java.util.Scanner;
class Static_variable
{
	public static void main(String args[]){
 Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    System.out.println(input);
	Student s = new Student();
	s.print();}
}
class Student{
	int roll_num = 301;
	String name ="ravina";
	static String clg ="GD College";
	void print(){
	System.out.println("Students-Details :- ");
	System.out.println("roll_no : "+roll_num +"\nname : "+name +"\ncollege : "+clg);
	}
}