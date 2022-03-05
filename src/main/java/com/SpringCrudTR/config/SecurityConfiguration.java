package com.SpringCrudTR.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

public class SecurityConfiguration extends WebSecurityConfigurerAdapter {


    private PasswordEncoder passwordEncoder;

    //Securityconfiguration clasinin constructor
    @Autowired
    public SecurityConfiguration(PasswordEncoder passwordEncoder){
        this.passwordEncoder=passwordEncoder;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        //http.authorizeRequests().anyRequest().permitAll();// No password required, not good
        http
                .csrf()
                .disable()
                .authorizeRequests()
                .antMatchers("/kisiler","index","css/*","/js/*")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .and()
                .httpBasic();
        //Authenticated --> sifreli olarak kullan
    }

    @Override
    @Bean
    protected UserDetailsService userDetailsService() {
        UserDetails user1 = User.builder().username("user").password(passwordEncoder.encode("1234")).roles("USER").build();
        UserDetails admin1 = User.builder().username("admin").password(passwordEncoder.encode("5678")).roles("ADMIN").build();

        return new InMemoryUserDetailsManager(user1,admin1);
    }
}
