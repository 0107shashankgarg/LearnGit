package com.Demo.DataGenerator;

import java.util.HashMap;

public class RunTimeDataBucket {
		public static HashMap runTimeData=new HashMap();
	public static void pushRunTimeData(String dataSetName,HashMap data)
	
	{
		runTimeData.put(dataSetName,data);
	}
}
