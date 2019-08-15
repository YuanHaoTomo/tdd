package com.tdd.course02;

import java.util.HashMap;
import java.util.Map;

public class Parser {
	
	public Map<String, Object> parserOut(String cmd, Map<String, Object> mapBase){
		String [] array=cmd.split("-");
		for (String string : array) {
			if(string==null || string.equals("")){
				continue;
			}
			String [] keyValuePair=string.split(" ");
			if(keyValuePair[0]==null){
				continue;
			}
			Object value=mapBase.getOrDefault(keyValuePair[0], null);
			if(value==null){
				if(keyValuePair.length>=2 && keyValuePair[1]!=null){
					mapBase.put(keyValuePair[0], keyValuePair[1]);
				}else{
					mapBase.put(keyValuePair[0], "缺少参数");
				}
				continue;
			}
			
			if(value instanceof Boolean){
				mapBase.put(keyValuePair[0], true);
				continue;
			}
			if(keyValuePair.length>=2 && keyValuePair[1]!=null){
				mapBase.put(keyValuePair[0], keyValuePair[1]);
			}else{
				mapBase.put(keyValuePair[0], value);
			}
		}

		for (Map.Entry<String, Object> entry : mapBase.entrySet()) {
		 
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		return mapBase;
	}

}
