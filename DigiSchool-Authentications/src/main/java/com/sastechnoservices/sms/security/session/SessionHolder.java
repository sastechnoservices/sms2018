package com.sastechnoservices.sms.security.session;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SessionHolder {
	
	private static Map<String,Session> sessionMap;
	private static SessionHolder instance;
	
	private SessionHolder() {}
	
	public static SessionHolder getinstance() {
		if(instance == null) {
			sessionMap = new HashMap();
			instance = new SessionHolder();
		}
		return instance;
	}
	public void addToSessionHolder(Session session) {
		sessionMap.put(session.getUserName(), session);
	}
	public Map<String,Session> getSessionList(){
		return sessionMap;
	}

}
