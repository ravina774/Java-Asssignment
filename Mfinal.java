class Mfinal {
    public static void main(String[] args){
	Bike b = new Bike();
	b.vspeed();
	
    }
}
/*class Bike extends B {
  // try to override final method
  public final void vspeed() {
    System.out.println("The final method is overridden.");
  }

 }*/
class Bike {
	int speed;    
	final void vspeed(){
        speed = 20;
	System.out.println("speed = "+speed);
    	}
}


