package com.netflix.clone.security;

import java.security.Key;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Function;


@Component
public class JwUtil {

    private static final Long JWT_TOKEN_VALIDITY = 30L * 24 * 60 * 60 * 1000;

    @Value("${jwt.secret:defaultSecretKeyForNetflixClone}")
    private String secret;

    private SecretKey getSigningKey() {
        //return io.jsonwebtoken.security.Keys.hmacShaKeyFor(secret.getBytes());
        return Keys.hmacShaKeyFor(secret.getBytes());
    }  

    public String getUsernameFromToken(String token) {
        return getClaimFromToken(token, Claims::getSubject);
    } 

    public String getRoleFromToken(String token) {
        return getClaimFromToken(token, claims -> claims.get("role", String.class));
    }

    public Date getExpirationDateFromToken(String token) {
        return getClaimFromToken(token, Claims::getExpiration);
    }   

    public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = getAllClaimsFromToken(token);
        return claimsResolver.apply(claims);
    }

    private Claims getAllClaimsFromToken(String token) {
        //return Jwts.parser().setSigningKey(getSigningKey()).build().parseSignedClaims(token).getPayload();    
        return Jwts.parserBuilder().setSigningKey(getSigningKey()).build().parseClaimsJws(token).getBody();
    }
    

    private Boolean isTokenExpired(String token) {
        final Date expiration = getExpirationDateFromToken(token);
        return expiration.before(new Date());
    }

    public String generateToken(String username, String role) {
        Map <String, Object> claims = new HashMap<>();
        claims.put("role", role);
        return doGenerateToken(claims, username);
    }

    public String doGenerateToken(Map<String, Object> claims, String subject) {
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(subject)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY))
                .signWith(getSigningKey())
                .compact();
    }

    public String doGenerateTokenV2(Map<String, Object> claims, String subject) {
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(subject)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY))
                .signWith(getSigningKey())
                .compact();
    }

    public Boolean validateToken(String token, String username) {
        try {
            getAllClaimsFromToken(token);
            return !isTokenExpired(token);
        } catch (Exception e) {
            return false;
        }
    }

}
