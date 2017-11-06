package com.Demo.Reporter;


import java.util.ArrayList;
import java.util.List;
public class StepComposite {
	
	public static List<Object> steps = new ArrayList<Object>();
	public  void add( Object step) 	
	{
		
    	try {
    		
    		steps.add(step);
    	
			} catch (Exception e ) {
				
				e.printStackTrace();
			
			} 
    	
	} 
    	
}
