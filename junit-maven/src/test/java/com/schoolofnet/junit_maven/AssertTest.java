package com.schoolofnet.junit_maven;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static com.schoolofnet.junit_maven.isEmptyString.*;
import static com.schoolofnet.junit_maven.DisivibleBy.*;

import org.junit.Test;

public class AssertTest {

	@Test
	public void testAssert() {
		String str1 = "jUnit";
		String str2 = "jUnit";
		Integer int1 = 0;
		Integer int2 = 1;
		
//		Arrays.asList(arg0)

		int [] array1 = {1, 2, 3, 4};
		int [] array2 = {1, 2, 3, 4};
		
//		assertArrayEquals(array1, array2);
//		
//		assertThat(str1, is("jUnit"));
//		assertThat(str1, isA(String.class));
//		assertThat("Not equals", "1234", is("123"));
		
		String tst = "";
		Integer tst2 = 5;
		
		assertThat(tst, is(isEmpty(tst)));
		assertThat(tst2, is(disivibleBy(2)));
	}
}
