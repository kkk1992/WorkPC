package com.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="configuration")
@Getter
@Setter
@NoArgsConstructor
public class Configuration {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	

	private int unit_id;
	
	@Column(length = 50, nullable = false)
	@Size(max=50)
	private String code;
	
	@Column(length = 10, nullable = false)
	@Size(max=10)
	private String value;
	
	@Column(length = 255, nullable = false)
	@Size(max=255)
	private String description;
	
	@ManyToOne
	private Unit unit;
	
}
