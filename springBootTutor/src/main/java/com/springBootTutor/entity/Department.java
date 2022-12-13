package com.springBootTutor.entity;



import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Department 
{
	@Id
	private long deptId;
	
	@NotBlank
	private String deptName;
	
	@NotBlank
	private String deptAddress;
	
	@NotBlank
	private String deptCode;
}
