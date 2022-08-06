class Excep_cls{
    public static void main(String args[]){
	int invalid=0,valid=0,num=0;
	 for(int i=0;i<args.length;i++){
		try
		{
			num=Integer.parseInt(args[i]);
			valid++;
 			System.out.println("value of valid= "+args[i]); 
 		}
		catch(Exception e)
		{
		System.out.println("value of invalid= "+ args[i]);  
		invalid++;
  		//System.out.println("valu of invalid= "+invalid); 
		continue;
 		}
	}
   	 System.out.println("valu of valid = "+valid); 
	System.out.println("valu of invalid= "+invalid); 
}
}