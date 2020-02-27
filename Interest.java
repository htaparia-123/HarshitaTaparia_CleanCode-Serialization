import java.io.IOException;

import java.io.OutputStreamWriter;

import java.util.Scanner;

	
class Interest

	{
	
		double principle;
	
		double rateOfInterest;

		double time;
	

		Interest(double principle,double rateOfInterest,double time)

		{
		
			this.principle=principle;
		
 			this.rateOfInterest=rateOfInterest;
		
			this.time=time;
	
		}
	

		double calculate_simpleInterest()

		{
		
			return (principle*rateOfInterest*time)/100;

		}
	

		double calculate_compoundInterest()
	
		{
	
			return principle*Math.pow((1+(rateOfInterest/100)),time);
	
		}

	}
