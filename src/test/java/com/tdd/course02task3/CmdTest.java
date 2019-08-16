package com.tdd.course02task3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CmdTest {
	
	@Test
	public void testArgs(){
		Cmd cmd =new Cmd("-l false -p 8080 -d /usr/logs");
		assertEquals(cmd.getValue("l"), "false");
		assertEquals(cmd.getValue("p"), "8080");
		assertEquals(cmd.getValue("d"), "/usr/logs");
	}
	

	@Test
	public void testArgs1(){
		Cmd cmd =new Cmd("-l -p  -d ");
		assertEquals(cmd.getValue("l"), "");
		assertEquals(cmd.getValue("p"), "");
		assertEquals(cmd.getValue("d"), "");
	}
	
	@Test
	public void testArgs2(){
		Cmd cmd =new Cmd("-l -p -9 -d ");
		assertEquals(cmd.getValue("l"), "");
		assertEquals(cmd.getValue("p"), "-9");
		assertEquals(cmd.getValue("d"), "");
	}
	
}
