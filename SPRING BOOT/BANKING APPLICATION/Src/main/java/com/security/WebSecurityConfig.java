package com.BankingApplication.Security;


import javax.sql.DataSource;

import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;

/**
 * Description of file WebSecurityConfig.java
 * 
 * @author
 *
 *         It is used to set the web security configuration
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WsConfigurerAdapter {
	@Autowired
	private DataSource dataSource;

	protected void configure(Authentication auth) throws Exception {

		// Memory Authentication
		/*
		 * auth.inMemoryAuthentication().withUser("admin").password("admin")
		 * .roles("ADMIN", "USER");
		 * auth.inMemoryAuthentication().withUser("user").password("user")
		 * .roles("USER");
		 */

		// JDBC authentication
		((Object) auth).jdbcAuthentication().dataSource(dataSource)
				.usersByUsernameQuery(
						"select username as principal, password as credentials, active from users where username=?")
				.authoritiesByUsernameQuery(
						"select username as principal, role as role from users_roles where username =?")
				.rolePrefix("ROLE_").passwordEncoder(new MD5Encoder());
	}

	protected void configure(@SuppressWarnings("rawtypes") HttpEntity http) throws Exception {
		http.formLogin().loginPage("/login");
		http.authorizeRequests().antMatchers("/home", "/getAccount").hasRole("USER");
		http.authorizeRequests().antMatchers("/saveAccountOperation").hasRole("ADMIN");
		http.exceptionHandling().accessDeniedPage("/403");

	}

}
