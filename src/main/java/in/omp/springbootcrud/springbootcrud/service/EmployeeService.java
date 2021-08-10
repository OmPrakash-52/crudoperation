package in.omp.springbootcrud.springbootcrud.service;

import java.util.List;

import in.omp.springbootcrud.springbootcrud.model.Employee;

public interface EmployeeService {

	List<Employee> get();
	Employee get(int id);
	
	void save(Employee emmployee);
	
	void delete(int id);
}
