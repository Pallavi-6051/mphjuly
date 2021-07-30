package com.mph.mvnproj;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AssertTestMethods {
	@Test
	public void testAllAssertMethods()
	{
		String str1 = new String("pallavi");
		String str2 = new String("pallavi");
		String str3 = null;
		String str4 = "pallavi";
		String str5 = "pallavi";
		
		int val1 =2;
		int val2 =7;
		
		String[] arr1 = {"piya","jiya","sonu","harsh"};
		String[] arr2 =  {"piya","jiya","sonu","harsh"};
		assertEquals(str1, str2);
		assertNotNull(str1);
		assertNull(str3);
		assertSame(str4, str5);
		assertTrue(val1<val2);
		assertFalse(val1>val2);
		assertArrayEquals(arr1, arr2);
	
		
		
	}
}
