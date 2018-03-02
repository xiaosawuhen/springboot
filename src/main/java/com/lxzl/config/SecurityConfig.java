package com.lxzl.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.lxzl.security.SecUserAuthenticationProvider;
import com.lxzl.security.SecUserService;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    SecUserAuthenticationProvider userDetailsAuthenticationProvider;

    @Autowired
    SecUserService userDetailsService;
	
    @Override
    protected void configure(HttpSecurity http) throws Exception {    
    
        http.authorizeRequests()
        		.anyRequest().authenticated()
                .and()
                	.formLogin()
                		.loginPage("/login")
                		.permitAll()
                		.usernameParameter("j_username")
                		.passwordParameter("j_password")
                		.defaultSuccessUrl("/index", true)
                		.loginProcessingUrl("/j_spring_security_check")
                		.failureUrl("/login?error")
                .and()
                	.logout()
                		.logoutUrl("/logout")
                .and()
                	.sessionManagement()
                	.maximumSessions(1)
                	.expiredUrl("/expired")
                .and()
                .and().exceptionHandling().accessDeniedPage("/accessDenied")
        		.and().csrf().disable();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/js/**", "/css/**", "/images/**", "/**/favicon.ico");
    }
    
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//            .inMemoryAuthentication()
//                .withUser("user").password("password").roles("USER");

//    	    	auth.userDetailsService(userDetailsService);
    	
    	auth.authenticationProvider(userDetailsAuthenticationProvider);
    }
}
