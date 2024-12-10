package com.repository.git.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityTest {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.sessionManagement(session -> session
                .invalidSessionUrl("/invalidSessionUrl")
                .maximumSessions(2)
                .expiredUrl("/expiredUrl")
        );
                return http.build();
    }
}
