package com.epam.Assignment_3_cleancode;


import java.io.IOException;

import java.io.OutputStreamWriter;

import java.util.Scanner;

	


	public class App extends Interest,HouseConstuction

	{
  
 		 public static void main( String[] args )throws IOException
   
		 {
  
  			Scanner scanner = new Scanner(System.in);
  
  			OutputStreamWriter output = new OutputStreamWriter(System.out);
   
 			double principle,rateOfInterest,time,totalAmount,totalArea,interestCalculated,totalHouseCost;
    
			char continuechoice;
    
			boolean automatedHouse;
  
  			int choice;
    
			String materialStandard;
    
			do
    
			{
    	   		
				output.write("\n\t\tMenu");
	
	    			output.flush();
	
    			output.write("\n1.Calculating Interest");

    				output.flush();
    	
				output.write("\n2.Total Construction Cost");
   
	 			output.flush();
    		
				output.write("\n Enter your choice .");
 
	   			output.flush();
    	
				choice=scanner.nextInt();
    	
				output.write("\n--------------------------\n");
    
				output.flush();
  
	  			switch(choice)
    	
				{
    		
					case 1:
						output.write("Calculating Interest");
 
   						output.flush();
    				
						output.write("\n Enter the principle Amount");
   
 						output.flush();
    			
						principle = scanner.nextDouble();
    	
						output.write("\n Enter the Rate of Interest p.a.");
  
  						output.flush();
    
						rateOfInterest = scanner.nextDouble();
 
   						output.write("\n Enter the time period(years)");
  
  						output.flush();
    	
						time= scanner.nextDouble();
  
  						Interest interest = new Interest(principle,rateOfInterest,time);
  
  						output.write("\n \n Compute");
    			
						output.flush();
    				
						output.write("\n 1.Simple Interest");
    
						output.flush();
    		
						output.write("\n 2.Compound Interest");
   
 						output.flush();
    	
						output.write("\n Enter your choice");
 
   						output.flush();
    				
						choice = scanner.nextInt();
    		
						switch(choice)
    			
						{
        	    
							case 1:
								interestCalculated = interest.calculate_simpleInterest();
 
       	    							totalAmount=principle+interestCalculated;
  
      	    							output.write("\n Simple Interest : " + interestCalculated);
  
      	    							output.flush();
        	    		
								output.write("\n Total Amount : " + totalAmount);
  
      	    							output.flush();
        	    		
							break;
        	    			
							case 2:
								 interestCalculated = interest.calculate_compoundInterest();
  
	      	    						totalAmount=interestCalculated;
  
	      	    						interestCalculated=interestCalculated-principle;
        	    				
								output.write("\n Compound Interest : " + interestCalculated);
        	    					
								output.flush();
        	    				
								output.write("\n Total Amount : " + totalAmount);
        	
			    					output.flush();
        	    				
								break;

        	    						default:
									output.write("\n Wrong Choice");

								output.flush();
				
						 	break;	
   
	 					}
    	
					break;
    	
					case 2: 
						output.write("\n Total Construction Cost Calculation");
    
						output.flush();
    				
						scanner.nextLine();
    				
						output.write("\n Enter the Material Standard(standard/abovestandard/highstandard)");
    
						output.flush();
    					
						materialStandard = scanner.nextLine();
    		
						output.write("\n Enter the total Area of the house");
    
						output.flush();
    					
						totalArea = scanner.nextDouble();
    				
						 automatedHouse=false;
    				
					
						if(materialStandard.equals("highstandard"))
 
	   					{
    						
							output.write("\n Do you want to have auotmated house(true/false)");
  
		  					output.flush();
    		
							automatedHouse=scanner.hasNextBoolean();
    
						}
    					
						HouseConstruction house = new HouseConstruction(materialStandard,totalArea,automatedHouse);
  
	  					totalHouseCost=house.calculate_totalConstructionCost();
    	
						output.write("\n Total Construction Cost :" + totalHouseCost);
  
	  					output.flush();
						break;
    	
					default:
						output.write("\n Wrong Choice");
	
						output.flush();
		
					break;
    		
				}
    		
				output.write("\n Do you want to continue");
    	
				output.flush();
    		
				scanner.nextLine();
    		
				continuechoice = scanner.next().charAt(0);
    	
			}while(continuechoice!='n' && continuechoice!='N');
    	
			scanner.close();	
    
		}

	}