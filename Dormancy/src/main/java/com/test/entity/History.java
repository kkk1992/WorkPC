package com.test.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="history")
@Setter
@Getter
@NoArgsConstructor

public class History {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String customer_id;
	
	private int unit_id;
	
	private int stage_id;
	
	private int task_id;
	
	@Size(max=10)
	private String status;
	
	private Date date;
	
}
