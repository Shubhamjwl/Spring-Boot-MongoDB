package com.shubh.model;

import java.util.List;
import java.util.Map;

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
	private List<Address> address;
	private Map<Integer, Info> info;

}
