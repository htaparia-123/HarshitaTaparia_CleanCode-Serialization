
import java.io.IOException;

import java.io.OutputStreamWriter;

import java.util.Scanner;




class HouseConstruction

	{
	
		String materialStandard;

		double totalArea;
	
		boolean automatedHouse;


		HouseConstruction(String materialStandard,double totalArea,boolean automatedHouse)

		{
		
			this.materialStandard=materialStandard;
		
			this.totalArea=totalArea;
	
			this.automatedHouse=automatedHouse;
	
		}
	

		double calculate_totalConstructionCost()

		{
		
			double totalCost=0.0;
	
			
			if(materialStandard.equals("standard"))
	
			{
			
				totalCost=1200*totalArea;	
	
		}
		

			else if(materialStandard.equals("abovestandard"))
	
			{
			
				totalCost=1500*totalArea;
		
			} 
		
			else if(materialStandard.equals("highstandard"))
	
			{
			
				if(automatedHouse==true)
	
				totalCost=2500*totalArea;
	
				else
				
				totalCost=1800*totalArea;
	
			}
		
			return totalCost;
		
	
		}

		}