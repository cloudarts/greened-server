package com.depressedrobots.greened;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GreenEdServerTest {
	
	@Rule
	public ExpectedException expected = ExpectedException.none();

	@Test
	public void test_InvalidPort() throws IOException {
		Integer port = 80;	/* some invalid portnumber */
		expected.expect(IOException.class);
		new GEServer(port);
	}

}
