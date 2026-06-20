package com.todoautos.auth.service;

import java.nio.charset.StandardCharsets;
import java.util.Date;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.todoautos.auth.entity.Usuario;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class JwtService {
    @Value("${jwt.secret}")
    private String secret;

    public String generarToken(Usuario usuario) {

        SecretKey key = new SecretKeySpec(
                secret.getBytes(StandardCharsets.UTF_8),
                "HmacSHA256");

        long ahora = System.currentTimeMillis();

        return Jwts.builder()
                .setSubject(usuario.getCorreo())
                .setIssuedAt(new Date(ahora))
                .setExpiration(new Date(ahora + 3600000)) // expira en 1 hora
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }
}
