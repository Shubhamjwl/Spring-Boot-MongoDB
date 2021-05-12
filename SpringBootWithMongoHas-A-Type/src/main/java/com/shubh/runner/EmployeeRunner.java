package com.shubh.runner;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.shubh.model.Address;
import com.shubh.model.Employee;
import com.shubh.model.Info;
import com.shubh.repository.EmployeeRespository;

@Component
public class EmployeeRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeRespository repo;

	@Override
	public void run(String... args) throws Exception {
        //delete all records
		repo.deleteAll();
		
		repo.save(new Employee(101,"shubh",300.0,
				List.of(new Address("India","mp","khandwa")),
				Map.of(1,new Info("shubh.55jwl@gmail.com",9479605143l))));
		
		List<Employee> findAll = repo.findAll();
		findAll.forEach(System.out::println);
		System.out.println("Its Done");

	}

}
