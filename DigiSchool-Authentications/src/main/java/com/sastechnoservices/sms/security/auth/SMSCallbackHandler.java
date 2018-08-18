package com.sastechnoservices.sms.security.auth;

import java.io.IOException;
import java.util.Base64;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;

public class SMSCallbackHandler implements CallbackHandler {
	
	private String userName;
	private String password;

	public SMSCallbackHandler(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		for(Callback callback : callbacks) {
			if(callback instanceof NameCallback) {
				NameCallback nameCallback = (NameCallback)callback;
				nameCallback.setName(userName);
			}else if(callback instanceof PasswordCallback) {
				//byte[] encodedPassword = Base64.getEncoder().encode(password.getBytes());
				PasswordCallback nameCallback = (PasswordCallback)callback;
				nameCallback.setPassword(password.toCharArray());
			}
		}
	}

}
