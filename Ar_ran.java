import java.lang.Math.*; 
class Ar_ran
{
	public static void main(String args[])
	{
	int i;
	double p,lrg=0,sml=0,sum=0;
	double[] r = new double[10];
	double[] ar = new double[10];
					
		for(i=0;i<10;i++){		
			r[i]= Math.random();
			p=3.14;
			ar[i]=p*r[i]*r[i];
			System.out.println(i +"= "+ar[i]);
			lrg=sml=ar[0];	
			if(ar[i]>lrg)
				lrg=ar[i];
				
			else if(ar[i]<sml)
				sml=ar[i];	
				
		}
	System.out.println("sml = "+sml);	
	System.out.println("lrg = "+lrg);
		for(i=1;i<=9;i++){
			sum=sum+ar[i];			
		}
		System.out.println("sum = "+sum);
	
	}				
}
	