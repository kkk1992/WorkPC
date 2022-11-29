package com.test.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="stages")
@Getter
@Setter
@NoArgsConstructor

public class Stage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@Size(max=50)
	private String stage_name;
	
	@NotNull
	@Size(max=255)
	private String description;
	
	@OneToMany(mappedBy = "stage")
	private Set<Execution> executions = new HashSet<>();
	
	@OneToMany(mappedBy = "stage")
	private Set<Task> task= new HashSet<>();
	
	
}
