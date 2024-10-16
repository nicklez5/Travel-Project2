package com.example.travel.configuration;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.servlet.HandlerExceptionResolver;

import java.io.IOException;

public class JwtAuthenticationFilter extends OncePerRequestFilter {
    private final HandlerExceptionResolver handlerExceptionResolver;

    private final JwtService jwtService;
    private final UserDetailsService userDetailsService;

    public JwtAuthenticationFilter(HandlerExceptionResolver handlerExceptionResolver, JwtService jwtService, UserDetailsService userDetailsService){
        this.handlerExceptionResolver = handlerExceptionResolver;
        this.jwtService = jwtService;
        this.userDetailsService = userDetailsService;
    }
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

    }
}
