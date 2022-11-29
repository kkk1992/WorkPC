package com.demo.entiy;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserEntity {

	private String username;
	private String password;
	private Collection<GrantedAuthority> grantedAuthoritiesList = new ArrayList<>();

	
}
