package com.Demo.DataGenerator;

import java.util.HashMap;

import org.w3c.dom.Element;

public class DataGenerator {
	HashMap<String, String> IndvData = new HashMap<String, String>();


public String GetData(String Key , Element elements)
{
	
	if (elements.getElementsByTagName(Key).item(0)
			.getTextContent() != null)
	{
	IndvData.put(Key, elements.getElementsByTagName(Key).item(0)
			.getTextContent());	
	return elements.getElementsByTagName(Key).item(0)
			.getTextContent();	
	}
	
	else return null;
}


}