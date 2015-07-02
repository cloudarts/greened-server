package com.depressedrobots.greened;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GreenEdServerTest {
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void testMain_noArguments() {
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("No port provided in arguments!");
		
		GreenEdServer.main(null);
	}
	
	@Test
	public void testMain_tooManyArguments() {
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("Too many arguments provided!");

		GreenEdServer.main(new String[]{"1234", "5678"});
	}
}
