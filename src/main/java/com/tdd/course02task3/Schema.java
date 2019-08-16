package com.tdd.course02task3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Schema {

	private Map<String, Object> schema;
	
	public Schema(String cmd) {
		schema=new HashMap<String, Object>();
		Arrays.asList(cmd.split(",")).stream().forEach(flag -> {
			String [] kv=flag.split(":");
			schema.put(kv[0].charAt(1)+"", kv[1]);
		});
	}

	public Object getValue(String key, String value) {
		switch (String.valueOf(schema.get(key))) {
		case "bool":
			return "true".equals(value);
		case "int":
			return value==null || value.equals("") ? 0 : new Integer(value);
		default:
			return value;
		}
	}
}
