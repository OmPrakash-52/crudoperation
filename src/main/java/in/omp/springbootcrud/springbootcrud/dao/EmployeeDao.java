package in.omp.springbootcrud.springbootcrud.dao;

import java.util.List;

import in.omp.springbootcrud.springbootcrud.model.Employee;

public interface EmployeeDao {

	List<Employee> get();
	Employee get(int id);
	
	void save(Employee emmployee);
	
	void delete(int id);
}
