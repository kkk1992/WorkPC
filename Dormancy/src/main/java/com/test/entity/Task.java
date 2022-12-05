package com.test.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="task")
@Getter
@Setter
@NoArgsConstructor
public class Task {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(insertable = false, updatable = false)
	private int stage_id;
	
	private String task_name;
	
	private int task_order;
	
	private boolean failureIgnorable;
	
	@NotNull
	@Size(max=255)
	private String description;
	
	@ManyToOne
	private Stage stage;
	
	
	@OneToMany(mappedBy = "task")
	private Set<Execution> execution = new HashSet<>();
	
}
