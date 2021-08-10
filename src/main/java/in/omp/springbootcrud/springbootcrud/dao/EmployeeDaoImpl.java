package in.omp.springbootcrud.springbootcrud.dao;

import java.util.List;


import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.omp.springbootcrud.springbootcrud.model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private EntityManager entityManger;
	
	@Override
	public List<Employee> get() {
		Session currentSession = entityManger.unwrap(Session.class);
		Query<Employee> query = currentSession.createQuery("from Employee",Employee.class);
		List<Employee> list=query.getResultList();
		return list;
	}

	@Override
	public Employee get(int id) {
	Session currentSession = entityManger.unwrap(Session.class);
	Employee employeeObj=currentSession.get(Employee.class, id);
	return employeeObj;
		
	}
	
	
	@Override
	public void save(Employee employee) {
		Session currentSession = entityManger.unwrap(Session.class);
		currentSession.saveOrUpdate(employee);
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManger.unwrap(Session.class);
		Employee employeeObj=currentSession.get(Employee.class,id);
		currentSession.delete(employeeObj);
		
	}

}
