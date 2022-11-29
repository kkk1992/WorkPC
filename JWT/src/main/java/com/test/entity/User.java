package com.test.entity;

import java.util.Set;
import java.util.concurrent.Callable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;

import org.slf4j.Logger;

@Entity
public class User {

	private String userName;
	
	private String userFirstName;
	
	private String userLastName;
	
	private String userPassword;
	
	@ManyToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	
	//many users may have many different roles
	
	private Set<Role> role;
	
	private Logger logger;
	
}
