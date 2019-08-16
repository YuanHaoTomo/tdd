package com.tdd.course02task3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArgsTest {
	
	@Test
	public void testArgs(){
		Args parser=new Args("-l:bool,-p:int,-d:string", "-l -p -d ");
		assertEquals(parser.getValue("l"), false);
		assertEquals(parser.getValue("p"), new Integer(0));
		assertEquals(parser.getValue("d"), "");
	}
	
	@Test
	public void testArgs1(){
		Args parser=new Args("-l:bool,-p:int,-d:string", "-l true -p 8080 -d /usr/logs");
		assertEquals(parser.getValue("l"), true);
		assertEquals(parser.getValue("p"), new Integer(8080));
		assertEquals(parser.getValue("d"), "/usr/logs");
	}
	
	@Test
	public void testArgs2(){
		Args parser=new Args("-l:bool,-p:int,-d:string", "-l false -p -999 -d 465");
		assertEquals(parser.getValue("l"), false);
		assertEquals(parser.getValue("p"), new Integer(-999));
		assertEquals(parser.getValue("d"), "465");
	}
	
}
