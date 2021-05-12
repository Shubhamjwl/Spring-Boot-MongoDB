package com.shubh.runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.shubh.model.Employee;
import com.shubh.repository.EmployeeRespository;

@Component
public class EmployeeRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeRespository repo;

	@Override
	public void run(String... args) throws Exception {
        //delete all records
		repo.deleteAll();
		
		repo.save(new Employee(101,"shubh",300.0));
		repo.save(new Employee(102,"vishal",500.0));
		repo.save(new Employee(103,"minakshi",800.0));
		
		Integer empId = repo.save(new Employee(104,"yogi",1000.0)).getEmpId();

		List<Employee> findAll = repo.findAll();
		findAll.forEach(System.out::println);
		System.out.println("----------------------------");
		Optional<Employee> opt = repo.findById(empId);
              System.out.println(opt.get());
		System.out.println("--------------------------");
		System.out.println(repo.findByEname("vishal").get());
		System.out.println("Its Done");

	}

}
