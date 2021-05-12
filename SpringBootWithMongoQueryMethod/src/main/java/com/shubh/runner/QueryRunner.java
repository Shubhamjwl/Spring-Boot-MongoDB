package com.shubh.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.shubh.repository.EmployeeRespository;

@Component
public class QueryRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeRespository repo;

	@Override
	public void run(String... args) throws Exception {

         //List<Employee> employeeByEname = repo.getEmployeeByEname("vishal");
         
       // repo.getEmployeeByEnameAndSalary("yogi", 100.0).forEach(System.out::println);
        // employeeByEname.forEach(System.out::println);
		 
		//repo.getEmployeeByEnameOrSalary("minakshi", 100.0).forEach(System.out::println);;
		
		//System.out.println(repo.getEmployeeCountByEname("minakshi"));

		//repo.getSortEmployee(300.0).forEach(System.out::println);
		//repo.getEnameAndSalary("shubh").forEach(System.out::println);
		
		//System.out.println(repo.isEmployeeExistBySalary(300.0));
		
		//start with s
		//repo.getEmployeeByEnameRegEx("^s").forEach(System.out::println);
		
		//ends with hi
		//repo.getEmployeeByEnameRegEx("hi$").forEach(System.out::println);

		//contians V
		repo.getEmployeeByEnameRegEx("v").forEach(System.out::println);

	}

}
