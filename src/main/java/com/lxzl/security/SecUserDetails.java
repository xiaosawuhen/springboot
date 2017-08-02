package com.lxzl.security;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class SecUserDetails implements UserDetails {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1035679108334694438L;
	
	
	private String username = null;
	private String password = null;
	private ArrayList<GrantedAuthority> authorities = null;
	
	private boolean accountNonExpired = true;
	private boolean accountNonLocked = true;
	private boolean credentialsNonExpired = true;
	private boolean enabled = true;
	
	
	public SecUserDetails(String username, String password) {
		this.username = username;
		this.password = password;
		this.authorities = new ArrayList<GrantedAuthority>();
	}

	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}

	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}

	public boolean isCredentialsNonExpired() {
		return credentialsNonExpired;
	}

	public boolean isEnabled() {
		return enabled;
	}

}
