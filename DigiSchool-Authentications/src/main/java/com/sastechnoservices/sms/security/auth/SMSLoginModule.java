package com.sastechnoservices.sms.security.auth;

import java.io.IOException;
import java.util.Map;

import javax.security.auth.Subject;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.security.auth.login.LoginException;
import javax.security.auth.spi.LoginModule;

import com.sastechnoservices.sms.security.session.SessionProcessor;
import com.sastechnoservices.sms.security.validator.CredentialValidator;

public class SMSLoginModule implements LoginModule{
	
	private Subject subject;
	private CallbackHandler callbackHandler;
	private Map sharedState;
	private Map options;
	private boolean loginSucess;

	@Override
	public void initialize(Subject subject, CallbackHandler callbackHandler, Map<String, ?> sharedState,
			Map<String, ?> options) {
		this.subject = subject;
		this.callbackHandler = callbackHandler;
		this.sharedState = sharedState;
		this.options = options;
		this.loginSucess = false;
	}

	@Override
	public boolean login() throws LoginException {
		NameCallback namecb = new NameCallback("user:");
		PasswordCallback passwordcb = new PasswordCallback("password", false); 
		Callback[] callbacks = new Callback[] {namecb,passwordcb};
		try {
			callbackHandler.handle(callbacks);
		}catch(IOException | UnsupportedCallbackException e) {
			System.out.println(e.getMessage());
			return false;
		}
		if(loginSucess = CredentialValidator.validate(namecb, passwordcb) && !SessionProcessor.isUserAlreadyLoggedIn(namecb.getName())) {
			System.out.println(SessionProcessor.openSession(namecb.getName()));
		}
		return loginSucess;
	}

	@Override
	public boolean commit() throws LoginException {
		return loginSucess;
	}

	@Override
	public boolean abort() throws LoginException {
		return false;
	}

	@Override
	public boolean logout() throws LoginException {
		System.out.println("Login Module : Logout Called...");
		return false;
	}

}
