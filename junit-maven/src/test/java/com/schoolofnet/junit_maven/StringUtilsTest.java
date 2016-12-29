package com.schoolofnet.junit_maven;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Ignore;

public class StringUtilsTest {

	@Test
	@Ignore
	public void testConcatenate() {
		StringUtils util = new StringUtils();
		
		String res = util.concatenate("SON", "jUnit");
		
		assertEquals("SONjUnit", res);
	}
}
