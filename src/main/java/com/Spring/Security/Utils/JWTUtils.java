package com.Spring.Security.Utils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;

@Component
public class JWTUtils {

    private final String SECRET = "Rajesh is good and he have few girl friends";
    private static final long EXPIRATION_TIME = 1000 * 60 * 60 ;
    public String generateToken(String userName){


        // For example, your secret might start as a string
        // then "Decoders.BASE64.decode(SECRET)" not required
        // if your secret like this "cmFqZXNoIGlzIGdvb2QgYm95" u need Decoders

        SecretKey key = Keys.hmacShaKeyFor(
                SECRET.getBytes());
        return Jwts.builder()
                .subject(userName)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis()+EXPIRATION_TIME))
                .signWith(key, Jwts.SIG.HS256)
                .compact();
    }

}
