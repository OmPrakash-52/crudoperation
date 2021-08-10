package in.omp.springbootcrud.springbootcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.omp.springbootcrud.springbootcrud.dao.EmployeeDao;
import in.omp.springbootcrud.springbootcrud.model.Employee;
@Repository
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	@Transactional
	@Override
	public List<Employee> get() {
		return employeeDao.get();
	}

	@Transactional
	@Override
	public Employee get(int id) {
		return employeeDao.get(id);
	}

	@Transactional
	@Override
	public void save(Employee employee) {
	employeeDao.save(employee);
	}

	@Transactional
	@Override
	public void delete(int id) {
		employeeDao.delete(id);
		
	}

}
