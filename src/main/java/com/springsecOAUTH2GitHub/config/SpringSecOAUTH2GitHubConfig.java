package com.springsecOAUTH2GitHub.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecOAUTH2GitHubConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((request) -> request.anyRequest().authenticated())
                .oauth2Login(Customizer.withDefaults());
        return http.build();
    }

//    @Bean
//    public ClientRegistrationRepository clientRegistrationRepository(){
//        ClientRegistration clientRegistration = clientRegistration();
//        return new InMemoryClientRegistrationRepository(clientRegistration);
//
//    }
//
//    @Bean
//    private ClientRegistration clientRegistration() {
//        // secret code and client id
//        return CommonOAuth2Provider.GITHUB.getBuilder("github").clientId("Ov23li5LcQeKLxqWyOMi")
//                .clientSecret("666d456192d4ae7732a35b8c87f1c467e99b3ee4").build();
//
//    }
//
}
