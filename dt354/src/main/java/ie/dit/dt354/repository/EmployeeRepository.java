package ie.dit.dt354.repository;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import ie.dit.dt354.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	Collection<Employee> findByDepartmentName(String department);
	Employee findByCode(String code);
}
