package com.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class User {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long userId;
	
	@NotNull
	@Size(max=20, message="Name should be less 20 characters")
	private String userName;
	
	//@Column(unique = true)
	@Email 
	private String email;
	
	@NotNull()
	//@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")
	private String password;
	
	@ManyToMany(cascade= CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinTable(name="user_role",
	joinColumns =  @JoinColumn(name = "userId", referencedColumnName = "userId")
    ,            inverseJoinColumns = @JoinColumn(name = "roleId", referencedColumnName = "roleId"))
	private Set <Role> roles;
	
	@OneToMany(mappedBy = "user")
	private Set<Item> item= new HashSet<>();
	
	
	
/*
 ^                 # start-of-string
(?=.*[0-9])       # a digit must occur at least once
(?=.*[a-z])       # a lower case letter must occur at least once
(?=.*[A-Z])       # an upper case letter must occur at least once
(?=.*[@#$%^&+=])  # a special character must occur at least once
(?=\S+$)          # no whitespace allowed in the entire string
.{8,}             # anything, at least eight places though
$                 # end-of-string
 */
	
	
}
