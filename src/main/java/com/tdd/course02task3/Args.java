package com.tdd.course02task3;

public class Args {
	
	private Schema schema;

	private Cmd cmd;
	
	public Args(String schemaStr, String cmdStr) {
		schema=new Schema(schemaStr);
		cmd=new Cmd(cmdStr);
	}
	
	public Object getValue(String key) {
		return schema.getValue(key, cmd.getValue(key));
	}

}
