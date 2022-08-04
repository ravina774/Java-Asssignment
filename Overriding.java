class Overriding{
	public static void main(String args[])
	{
		SBI S = new SBI();
		ICICI I = new ICICI();
		AXIS A = new AXIS();
		System.out.println(S.intrest_rate());
		System.out.println(I.intrest_rate());
		System.out.println(A.intrest_rate());
		
	}
}
class Bank{
	int intrest_rate(){
	return 0;
	}
}
class SBI extends Bank{
	int intrest_rate(){
	return 7;
	}
}
class ICICI extends Bank{
	int intrest_rate(){
	return 8;
	}
}
class AXIS extends Bank{
	int intrest_rate(){
	return 9;
	}
}