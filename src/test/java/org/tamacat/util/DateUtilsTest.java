/*
 * Copyright (c) 2007, tamacat.org
 * All rights reserved.
 */
package org.tamacat.util;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

public class DateUtilsTest {

	@Test
	public void testGetTime() {
		System.out.println(DateUtils.getTime(new Date(), "yyyy-MM-dd HH:mm:ss,S"));
		assertTrue(true);
	}

	@Test
	public void testGetTimeLocale() {
		System.out.println(DateUtils.getTime(new Date(), "yyyy-MM-dd HH:mm:ss,S", Locale.US));
		assertTrue(true);
	}
	
	@Test
	public void testGetTimeLocaleTimeZone() {
		System.out.println(DateUtils.getTime(new Date(), "yyyy-MM-dd HH:mm:ss,S", Locale.US, TimeZone.getDefault()));
		assertTrue(true);
	}

	@Test
	public void testGetTimestamp() {
		DateUtils.getTimestamp("yyyy-MM-dd HH:mm:ss,S");
	}

	@Test
	public void testGetTimestampLocale() {
		DateUtils.getTimestamp("yyyy-MM-dd HH:mm:ss,S", Locale.US);
	}

	@Test
	public void testParseTime() {
		System.out.println(DateUtils.parse("2011-01-01 00:00:00", "yyyy-MM-dd HH:mm:ss"));
		assertTrue(true);
	}

	@Test
	public void testParseTimeZone() {
		System.out.println(DateUtils.parse("2011-01-01 00:00:00", "yyyy-MM-dd HH:mm:ss", Locale.US, TimeZone.getTimeZone("GMT")));
		assertTrue(true);
	}

	
	@Test
	public void testParseTimeError() {
		assertNull(DateUtils.parse("2011", "yyyy-MM-dd HH:mm:ss"));
	}

}
