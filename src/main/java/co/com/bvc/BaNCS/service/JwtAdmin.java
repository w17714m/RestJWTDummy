package co.com.bvc.BaNCS.service;

import java.security.Key;
import java.util.Calendar;
import java.util.Date;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


@Service
public class JwtAdmin {
	
	public String createJWT() {
		SignatureAlgorithm sinAlgorithm = SignatureAlgorithm.HS256;

		java.util.Date date = new java.util.Date();
		Calendar newDate = Calendar.getInstance();
		newDate.setTime(date);
		newDate.add(Calendar.MINUTE, 2);
		
		
		long nowMillis = System.currentTimeMillis();
		long ttlMillisl = newDate.getTimeInMillis();
				
		Date now  = new Date(nowMillis);
		
		byte[] apiSecrets = DatatypeConverter.parseBase64Binary("secreto");
		
		Key signinKey = new SecretKeySpec(apiSecrets, sinAlgorithm.getJcaName());
		
		
		JwtBuilder builder = Jwts.builder().setId("id")
				.setIssuedAt(now)
				.setSubject("subject")
				.setIssuer("issuer")
				.signWith(sinAlgorithm, apiSecrets);
		
		if(newDate.getTimeInMillis()>=0) {
			long exMillis = nowMillis + ttlMillisl;
			Date exp = new Date(exMillis);
			builder.setExpiration(exp);
		}
		
		return builder.compact();
	}
	
	
	public void verifyJWT(String jwt) {
		Claims claims = Jwts.parser()
				.setSigningKey(DatatypeConverter.parseBase64Binary("secrets"))
				.parseClaimsJws(jwt).getBody();
		
		System.out.println("Id -->" + claims.getId() );
		System.out.println("Subject -->" + claims.getSubject());
		System.out.println("Issuer -->" + claims.getIssuer() );
		System.out.println("Expiration -->" + claims.getExpiration());
	}
	
	

}
