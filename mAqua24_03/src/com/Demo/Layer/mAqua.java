package com.Demo.Layer;

import com.Demo.BusinessLayer.PageObject.PageObject;
import com.Demo.Layer.Interfaces.mAquaMethods;
import com.Demo.Layer.Validations.Validation;
import com.Demo.Setup.ToolInvoke.EnviornmentSetup;

public class mAqua {
String  enviornment = "Android";
public static Validation validations;
public static mAquaMethods generic ;
public static PageObject Locaters ;


public mAqua()
{
	assign(this.enviornment);
}

public  static void assign(String enviornment)
{

	if(EnviornmentSetup.taskDetails.get("platformName").equals("Android"))
{
	com.Demo.Layer.Android.Android gen = new com.Demo.Layer.Android.Android();
	generic = gen;
	Locaters = new PageObject();
	Locaters.Android();
	Locaters = mAqua.Locaters;

}
	else
	{
		com.Demo.Layer.iOS.iOS gen = new com.Demo.Layer.iOS.iOS();
	generic = gen;
	Locaters = new PageObject();
	Locaters.iOS();
	Locaters = mAqua.Locaters;

	}
}
}
		
	
	
	

	

