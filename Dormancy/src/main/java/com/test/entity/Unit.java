package com.test.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="units")
@Getter
@Setter
@NoArgsConstructor

public class Unit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Size(max=50)
	private String code;
	
	@Size(max=10)
	private String currency;
	
	@Size(max=10)
	private String timeZone;
	
	@OneToMany(mappedBy = "unit", cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Execution> execution = new HashSet<>();
	
	@OneToMany(mappedBy = "unit",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Configuration> configuration = new HashSet<>();
}
