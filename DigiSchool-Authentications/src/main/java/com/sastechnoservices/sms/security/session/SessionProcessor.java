package com.sastechnoservices.sms.security.session;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.sastechnoservices.sms.security.token.TokenProcessor;

public class SessionProcessor {
	
	private static Integer sessionProgress = 0;

	private static String generateSessionID() {
		String sessionId = "SMSSession";
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyHHmmss");
		String date = sdf.format(cal.get(Calendar.DATE));
		sessionId = sessionId.concat(date).concat(sessionProgress.toString());
		sessionProgress++;
		return sessionId;
	}

	public static String openSession(String username) {
		System.out.println("Session Registed to User : " + username);
		Session session = new Session();
		session.setUserName(username);
		session.setStartTime(new Date());
		session.setSessionID(generateSessionID());
		session.setToken(TokenProcessor.generateJWTAuthToken(username));
		SessionHolder.getinstance().addToSessionHolder(session);
		return session.getToken().getAuthToken();
	}

	public static boolean isUserAlreadyLoggedIn(String username) {
		if (SessionHolder.getinstance().getSessionList()!=null && SessionHolder.getinstance().getSessionList().get(username)!=null) {
			return true;
		}
		return false;
	}
}
