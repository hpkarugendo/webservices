package ie.dit.dt354.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ie.dit.dt354.model.Employee;
import ie.dit.dt354.service.EmployeeService;

@RestController
@RequestMapping("/rest/employees")
public class EmployeeServiceController {
	@Autowired
	EmployeeService eService;
	
	@RequestMapping("/all")
	public List<Employee> getAllEmps(){
		return eService.getAllEmps();
	}
	
	@RequestMapping("{code}")
	public Employee findEmp(@PathVariable("code") String code){
		return eService.findEmp(code);
	}
	
}
