package com.lxzl.security;

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

@Component
public class UserDetailsAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {

	@Override
	protected void additionalAuthenticationChecks(UserDetails userDetails,
			UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {

		if (userDetails == null) {
			throw new AuthenticationServiceException("user did not exist");
		}

		String password = (String) authentication.getCredentials();

		if (!userDetails.getPassword().equals(password)) {
			throw new BadCredentialsException("Bad credentials:" + userDetails);
		}
		
		if (!userDetails.isAccountNonLocked()) {
			throw new LockedException(
					messages.getMessage("AbstractUserDetailsAuthenticationProvider.locked", "User account is locked"),
					userDetails);
		}

		if (!userDetails.isEnabled()) {
			throw new DisabledException(
					messages.getMessage("AbstractUserDetailsAuthenticationProvider.disabled", "User is disabled"),
					userDetails);
		}

		if (!userDetails.isAccountNonExpired()) {
			throw new AccountExpiredException(messages.getMessage("AbstractUserDetailsAuthenticationProvider.expired",
					"User account has expired"), userDetails);
		}
	}

	@Override
	protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication)
			throws AuthenticationException {

		UserDetails loadedUser = null;

		if (StringUtils.isEmpty(username)) {
			throw new AuthenticationServiceException("The username can not be null");
		}

		try {
			loadedUser = new SecUserDetails(username, "password");
		} catch (UsernameNotFoundException notFound) {
			throw notFound;
		} catch (Exception repositoryProblem) {
			throw new AuthenticationServiceException(repositoryProblem.getMessage(), repositoryProblem);
		}

		return loadedUser;
	}

}
