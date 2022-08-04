	class Ac_pri
	{
    	private int a;
		Ac_pri()
			{
				a=20;
				}
		void geta() {
				a=10;
				}
		void display() {
		System.out.println("value of a = " +a);  }
	 public static void main(String[] args){
	Ac_pri a = new Ac_pri();
		
	a.display();
	a.geta();
	a.display();
	
    }
    }

