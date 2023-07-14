package com.myMag.SpringBackend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    public static final String[] ENDPOINTS_WHITELIST = {
            "/products/*",
            "/",
    };

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // Setup that has no security for the moment :D
        http.
                authorizeHttpRequests( request ->
                request.anyRequest().
                        permitAll()).
                csrf(AbstractHttpConfigurer::disable);

        return http.build();
    }
}
