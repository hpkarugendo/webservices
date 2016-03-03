package ie.dit.dt354.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ie.dit.dt354.model.Employee;
import ie.dit.dt354.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository eRepo;
	
	public List<Employee> getAllEmps(){
		return eRepo.findAll();
	}
	
	public Employee findEmp(String code){
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
