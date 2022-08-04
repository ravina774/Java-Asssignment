class Cfinal {
    public static void main(String[] args){
	Bike b = new Bike();
	b.vspeed();
       
    }
}
final class Bike{
    int speed;
	void vspeed(){
        speed = 20;
	System.out.println("speed = "+speed);
    	}
}
//class Bike1 extends Bike{
   
//}
