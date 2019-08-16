package com.tdd.course02task3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SchemaTest {
	
	@Test
	public void testArgs(){
		Schema schema =new Schema("-l:bool,-p:int,-d:string");
		assertEquals(schema.getValue("l", "true"), true);
		assertEquals(schema.getValue("p", "80"), new Integer(80));
		assertEquals(schema.getValue("d", "a"), String.valueOf("a"));
	}
	

	@Test
	public void testArgs1(){
		Schema schema =new Schema("-l:bool,-p:int,-d:string");
		assertEquals(schema.getValue("l", "false"), false);
		assertEquals(schema.getValue("p", ""), new Integer(0));
		assertEquals(schema.getValue("d", "nibaba"), String.valueOf("nibaba"));
	}
	
}
