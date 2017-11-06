package com.Demo.Utilities;




public class RandomGenrator {
	
	public static enum Mode {
	    ALPHA, ALPHANUMERIC, NUMERIC ,SPECIALCHARACTERS
	}
	
	public static String generateRandom(int length, Mode mode) throws Exception {

		StringBuffer buffer = new StringBuffer();
		String characters = null;

		switch(mode){
		
		case ALPHA:
			characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			break;
		
		case ALPHANUMERIC:
			characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
			break;
	
		case NUMERIC:
			characters = "1234567890";
		    break;
		case SPECIALCHARACTERS:
			characters = "!@#$%^&*(){}[] <>?/:;_-";
		    break;
		}
		
		int charactersLength = characters.length();

		for (int i = 0; i < length; i++) {
			double index = Math.random() * charactersLength;
			buffer.append(characters.charAt((int) index));
		}
		return buffer.toString();
	}


	  
	  
	 
}
	