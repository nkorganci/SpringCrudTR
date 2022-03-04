package com.SpringCrudTR.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfiguration extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {

        //http.authorizeRequests().anyRequest().permitAll();// No password required, not good
        http.csrf().disable().authorizeRequests().anyRequest().authenticated().and().formLogin().and().httpBasic();
        //Authenticated --> sifreli olarak kullan
    }
}
