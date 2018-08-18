package com.sastechnoservices.sms.security.validator;

import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;

public class CredentialValidator {

	public static boolean validate(NameCallback uname, PasswordCallback pass) {
		boolean flag = false;
		if(uname.getName().equals("abhijeet") && new String(pass.getPassword()).equals("guru")) {
			flag = true;
		}
		return flag;
	}
}
