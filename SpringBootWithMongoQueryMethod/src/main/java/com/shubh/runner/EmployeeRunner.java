package com.shubh.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.shubh.model.Employee;
import com.shubh.repository.EmployeeRespository;

//@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRespository repo;

	@Override
	public void run(String... args) throws Exception {
		// delete all records
		repo.deleteAll();

		repo.save(new Employee(101, "shubh", 300.0));
		repo.save(new Employee(102, "vishal", 500.0));
		repo.save(new Employee(103, "minakshi", 800.0));
		repo.save(new Employee(104, "yogi", 100.0));

		System.out.println("Its Done");

	}

}
