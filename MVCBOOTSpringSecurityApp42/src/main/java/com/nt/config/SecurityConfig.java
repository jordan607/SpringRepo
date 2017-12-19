package com.nt.config;


import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private DataSource ds;
	
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		System.out.println("SecurityConfig:configAuthentiation(-)"+ds.getClass());
	  auth.jdbcAuthentication().dataSource(ds)
		.usersByUsernameQuery(
			"select uname,pwd,status from users where uname=?")
		.authoritiesByUsernameQuery(
			"select uname, role from users_roles where uname=?");
	}	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		System.out.println("SecurityConfig:configure(-)");

	  http.authorizeRequests()
	   .antMatchers("/home.htm").access("permitAll")
		.antMatchers("/inbox.htm").access("hasRole('ROLE_OWNER')")
		.and()
		  .formLogin()
		.and()
		  .logout().logoutUrl("index.jsp")
		  .and()
		  .exceptionHandling().accessDeniedPage("/error.jsp");
	}
	

}
