package com.lxzl.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.lxzl.db.bean.User;
import com.lxzl.service.UserService;

@Component
public class UserDetailsAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {

    @Autowired  
    private UserService userService;
	
	@Override
	protected void additionalAuthenticationChecks(UserDetails userDetails,
			UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
	}

	@Override
	protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication)
			throws AuthenticationException {

		if (StringUtils.isEmpty(username)) {
			throw new AuthenticationServiceException("The username can not be null");
		}
		
		SecUser secUser = null;
		User user = userService.findByUserName(username);

		try {
			if(user != null){
				secUser = new SecUser(user.getName(), user.getPassword());
			} else {
				throw new AuthenticationServiceException("user did not exist");
			}
		} catch (UsernameNotFoundException notFound) {
			throw notFound;
		} catch (Exception repositoryProblem) {
			throw new AuthenticationServiceException(repositoryProblem.getMessage(), repositoryProblem);
		}

		String password = (String) authentication.getCredentials();

		if (!secUser.getPassword().equals(password)) {
			throw new BadCredentialsException("Bad credentials:" + secUser);
		}
		
		if (!secUser.isAccountNonLocked()) {
			new LockedException("User account is locked");
		}

		if (!secUser.isEnabled()) {
			throw new DisabledException("User is disabled");
		}

		if (!secUser.isAccountNonExpired()) {
			throw new AccountExpiredException("User account has expired");
		}

		return secUser;
	}

}
