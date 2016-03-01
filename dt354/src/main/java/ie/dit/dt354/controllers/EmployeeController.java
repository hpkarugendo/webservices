package ie.dit.dt354.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ie.dit.dt354.model.Employee;
import ie.dit.dt354.repository.EmployeeRepository;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeRepository eRepo;
	Employee newEmp, emp;
	
	@RequestMapping(value="/employees/new", method=RequestMethod.POST)
	public String addEmployee(@ModelAttribute Employee emp0, Model model){
		eRepo.save(emp0);
		model.addAttribute("emp0", emp0);
		return "redirect:index.html";
	}
	
	@RequestMapping(value="/employees/add", method=RequestMethod.GET)
	public String newEmployee(Model model){
		model.addAttribute("emp0", new Employee());
		
		return "employees_new";
	}
	
	@RequestMapping(value="/employees/index", method=RequestMethod.GET)
	public String allEmployees(Model model){
		model.addAttribute("employees", eRepo.findAll());
		return "employees_all";
	}
}
