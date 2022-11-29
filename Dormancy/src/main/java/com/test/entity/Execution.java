package com.test.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="executions")
@Getter
@Setter
@NoArgsConstructor
public class Execution {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@Size(max=10)
	private String customer_id;
	
	@NotNull
	private int unit_id;
	
	@NotNull
	private int stage_id;
	
	@NotNull
	private int task_id;
	
	@Size(max=10)
	private String status;
	
	private Date date;
	
	@ManyToOne
	//@JoinColumn(name = "unit_id")
	private Unit unit;
	
	@ManyToOne
	//@JoinColumn(name= "stage_id")
	private Stage stage;
	
	@ManyToOne
	private Task task;
	
	
	
	
}
