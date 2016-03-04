package ie.dit.dt354.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ie.dit.dt354.model.Department;
import ie.dit.dt354.model.Employee;
import ie.dit.dt354.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository eRepo;
	@Autowired
	DepartmentService dRepo;
	
	public List<Employee> getAllEmps(){
		return eRepo.findAll();
	}
	
	public Employee findEmp(String code){
		if(eRepo.findAll().size() < 1) {
			List<Department> departments = dRepo.getDepartments();
			Employee employee = new Employee("1001", "Henry Patrick Karugendo", "henry@dit.ie", "0873345554", "MALE");
			employee.setDepartment(departments.get(1));
			eRepo.save(employee);
			employee = new Employee("2001", "Ben Stiller", "ben@dit.ie", "0873343454", "MALE");
			employee.setDepartment(departments.get(4));
			eRepo.save(employee);
			employee = new Employee("3001", "Mary Regan", "mary@dit.ie", "0173345554", "FEMALE");
			employee.setDepartment(departments.get(2));
			eRepo.save(employee);
		}
		
		return eRepo.findByCode(code);
	}
	
	public Employee updateEmp(Employee emp){
		eRepo.save(emp);
		return eRepo.findByCode(emp.getCode());
	}
	
	public Employee deleteEmp(Employee emp){
		eRepo.delete(emp);
		return emp;
	}
}
