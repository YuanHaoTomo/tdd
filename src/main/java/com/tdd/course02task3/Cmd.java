package com.tdd.course02task3;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

public class Cmd {
	
	private Map<String, String> cmdMap;
	
	public Cmd(String cmd) {
		cmdMap=new HashMap<>();
		ListIterator<String> iterable=Arrays.asList(cmd.split(" ")).listIterator();
		while (iterable.hasNext()) {
			String str=iterable.next();
			if(str.startsWith("-") && !isNumeric(str.substring(1))){
				cmdMap.put(str.substring(1), "");
				if (iterable.hasNext()) {
					String value=iterable.next();
					if(!value.startsWith("-") || (value.startsWith("-") && isNumeric(value.substring(1)))){
						cmdMap.put(str.substring(1), value);
					}else{
						iterable.previous();
					}
				}
			}
		}
	}

	public String getValue(String key) {
		return cmdMap.get(key);
	}
	
	public boolean isNumeric(String str) {
        try {
            new BigDecimal(str).toString();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
