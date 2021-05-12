package com.shubh.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shubh.model.Employee;

public interface EmployeeRespository extends MongoRepository<Employee, Integer> {

	Optional<Employee> findByEname(String ename);
}
