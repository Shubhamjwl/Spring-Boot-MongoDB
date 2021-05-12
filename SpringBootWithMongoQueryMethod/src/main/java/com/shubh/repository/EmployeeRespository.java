package com.shubh.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.shubh.model.Employee;

public interface EmployeeRespository extends MongoRepository<Employee, Integer> {

	@Query("{ename:?0}")
	List<Employee>  getEmployeeByEname(String ename);
	
	@Query("{ename: ?0, salary: ?1}")
	List<Employee> getEmployeeByEnameAndSalary(String ename,Double salary);
	
	@Query("{$or:[{ename: ?0}, {salary: ?1}]}")
	List<Employee> getEmployeeByEnameOrSalary(String ename,Double salary);

	@Query(value="{ename:?0}",count = true)
    Integer getEmployeeCountByEname(String ename);
	
	@Query(value="{salary:?0}",sort = "{ename:1}")
	List<Employee> getSortEmployee(Double salary);
	
	@Query(value="{ename:?0}",fields = "{empId:0,ename:1,salary:1}")
	List<Employee> getEnameAndSalary(String ename);
	
	@Query(value="{salary:?0}",exists = true)
	Boolean isEmployeeExistBySalary(Double salary);
	
	@Query("{ename:{$regex:?0}}")
	List<Employee> getEmployeeByEnameRegEx(String ename);
}
