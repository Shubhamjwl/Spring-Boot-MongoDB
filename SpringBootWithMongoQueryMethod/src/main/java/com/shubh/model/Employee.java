package com.shubh.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Employee {

	@NonNull
	@Id
	private Integer empId;
	@NonNull
	private String ename;
	@NonNull
	private Double salary;

}
