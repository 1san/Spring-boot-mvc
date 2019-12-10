package com.san.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.san.service.UserService;

@Configuration
@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

	@Autowired
	UserService userService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
	}

	
	  @Override protected void configure(HttpSecurity http) throws Exception {
	  http.csrf().disable(); http.authorizeRequests()
	  .antMatchers("/","/login","/home").permitAll()
	  .antMatchers("/admin/**").hasAnyRole("ADMIN")
	  .antMatchers("/user/**").hasAnyRole("ADMIN","USER")
	  .anyRequest().authenticated() .and()
	  .formLogin().loginPage("/login").usernameParameter("email").passwordParameter("password").defaultSuccessUrl("/profile").permitAll() .and()
	  .logout().invalidateHttpSession(true) .clearAuthentication(true)
	  .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
	  .logoutSuccessUrl("/home").permitAll(); }
	 
	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * http.authorizeRequests().anyRequest().authenticated().and().httpBasic().and()
	 * .sessionManagement() .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	 * }
	 */
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
