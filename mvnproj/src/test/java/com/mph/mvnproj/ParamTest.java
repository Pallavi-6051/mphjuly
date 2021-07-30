package com.mph.mvnproj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParamTest {
	private int x,y,result;
	Calculator calc;
	public ParamTest(int x, int y, int result) {
		super();
		this.x = x;
		this.y = y;
		this.result = result;
	}
	@Before
	public void setUp() throws java.lang.Exception
	{
		System.out.println("@Before Called");
		calc = new Calculator();
	}
	
	@After
	public void tearDown() throws java.lang.Exception
	{
		calc=null;
		System.out.println("@After Called");
	}
	@Parameters
	public static Collection data()
	{
		return Arrays.asList(new Object[][] {{10,10,20},{20,20,40},{100,200,300}});
		
	}
	@Test
	public void testSum()
	{
		System.out.println("Add Test");
		//assertEquals(130,calc.add(10,20,70));
		assertEquals(result,calc.add(x,y));
	}
}
