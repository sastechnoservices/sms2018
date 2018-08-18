package com.sastechnoservices.sms.security.token;

import org.jose4j.jwk.RsaJsonWebKey;
import org.jose4j.jwk.RsaJwkGenerator;
import org.jose4j.jws.AlgorithmIdentifiers;
import org.jose4j.jws.JsonWebSignature;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.jwt.NumericDate;
import org.jose4j.lang.JoseException;

public class TokenProcessor {

	public static Token generateJWTAuthToken(String userName) {
		Token token = new Token();
		JwtClaims claims = new JwtClaims();
		try {
			RsaJsonWebKey jsonWebKey = RsaJwkGenerator.generateJwk(2048);
			claims.setAudience("DigiSchools");
			claims.setSubject(userName);
			/*--------Set Expiry-------*/
			NumericDate exp = NumericDate.now();
			exp.addSeconds(900);
			claims.setExpirationTime(exp);
			claims.setIssuedAtToNow();
			JsonWebSignature jws = new JsonWebSignature();
			jws.setPayload(claims.toJson());
			jws.setKey(jsonWebKey.getPrivateKey());
			jws.setAlgorithmHeaderValue(AlgorithmIdentifiers.RSA_USING_SHA512);
			token.setAuthToken(jws.getCompactSerialization());
		} catch (JoseException e) {
			e.printStackTrace();
		}
		return token;
	}
	
	public static boolean isJWTAuthTokenValid(String authToken) {
		return false;
	}
}
