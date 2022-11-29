package com.crud.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="roles")
@Getter
@Setter
@NoArgsConstructor
public class Role {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@Size(max= 20)
	private String name;

	@ManyToMany(mappedBy = "roles")
	private Set<User> users = new HashSet<>();

	
	
//	@ManyToMany(mappedBy = "roles")  //table name same class
//	private Set<User> users= new HashSet<>();
    
	
	
	
}
