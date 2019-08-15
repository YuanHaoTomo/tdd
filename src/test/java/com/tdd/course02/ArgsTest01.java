package com.tdd.course02;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.tdd.course02.Parser;

public class ArgsTest01 {
	
	private Map<String, Object> mapBase=new HashMap<String, Object>();
	
	@Before
	public void setUp(){
		mapBase.put("l", false);
		mapBase.put("p", 0);
		mapBase.put("d", "");
	}
	
	@Test
	public void testArgs(){
		Parser parser=new Parser();
		String cmd="-l -p 8080 -d /usr/logs";
		Map<String, Object> map=parser.parserOut(cmd, mapBase);
		assertEquals(map.get("l"), true);
		assertTrue(Integer.valueOf(map.get("p").toString()).equals(Integer.valueOf(8080)));
		assertEquals(map.get("d"), "/usr/logs");
		
	}

	
	@Test
	public void testArgs2(){
		Parser parser=new Parser();
		String cmd="-p -d ";
		Map<String, Object> map=parser.parserOut(cmd, mapBase);
		assertEquals(map.get("l"), false);
		assertTrue(Integer.valueOf(map.get("p").toString()).equals(Integer.valueOf(0)));
		assertEquals(map.get("d"), "");
	}
	
	@Test
	public void testArgs3(){
		Parser parser=new Parser();
		String cmd="-l -p 8080 -d /usr/logs -c aa";
		Map<String, Object> map=parser.parserOut(cmd, mapBase);
		assertEquals(map.get("l"), true);
		assertTrue(Integer.valueOf(map.get("p").toString()).equals(Integer.valueOf(8080)));
		assertEquals(map.get("d"), "/usr/logs");
		assertEquals(map.get("c"), "aa");
	}
	
	@Test
	public void testArgs4(){
		Parser parser=new Parser();
		String cmd="-l -p 8080 -d /usr/logs -c";
		Map<String, Object> map=parser.parserOut(cmd, mapBase);
		assertEquals(map.get("l"), true);
		assertTrue(Integer.valueOf(map.get("p").toString()).equals(Integer.valueOf(8080)));
		assertEquals(map.get("d"), "/usr/logs");
		assertEquals(map.get("c"), "缺少参数");
	}
}
