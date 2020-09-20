package com.orquestrador.condominio.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfigurations extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
	}

	@Override
	public void configure(final WebSecurity web) throws Exception {
	}

	@Override
	protected void configure(final HttpSecurity http) throws Exception {
	}
}
