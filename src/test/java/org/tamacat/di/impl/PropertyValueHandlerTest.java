package org.tamacat.di.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({System.class, PropertyValueHandler.class})
public class PropertyValueHandlerTest {

	@Test
	public void testReplaceEnvironmentVariable() {
		PowerMockito.mockStatic(System.class);
		PowerMockito.when(System.getenv("LOCAL_SERVER")).thenReturn("localhost");
		assertEquals(
			"localhost", 
			PropertyValueHandler.replaceEnvironmentVariable("${LOCAL_SERVER}")
		);
	}
}
