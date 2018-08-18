package com.sastechnoservices.sms.security.auth;

import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

public class SMSJAASAuthenticator {
	public void authenticate(String username, String password) {
		try {
			System.setProperty("java.security.auth.login.config", SMSJAASAuthenticator.class.getClassLoader().getResource("sms-jaas.conf").getPath());
			LoginContext lc = new LoginContext("SMSLogin", new SMSCallbackHandler(username, password));
			lc.login();
		} catch (LoginException e) {
			System.out.println(e.getMessage());
		}
	}
}
