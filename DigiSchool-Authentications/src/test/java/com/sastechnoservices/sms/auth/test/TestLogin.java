package com.sastechnoservices.sms.auth.test;

import org.junit.Test;

import com.sastechnoservices.sms.security.auth.SMSJAASAuthenticator;

public class TestLogin {

	@Test
	public void testLogin() {
		SMSJAASAuthenticator sja = new SMSJAASAuthenticator();
		sja.authenticate("abhijeet", "guru");
	}
	
}
