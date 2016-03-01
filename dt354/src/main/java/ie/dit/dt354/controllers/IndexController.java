package ie.dit.dt354.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ie.dit.dt354.model.Employee;
import ie.dit.dt354.repository.EmployeeRepository;

@Controller
public class IndexController {
	Employee currentEmp;
	@Autowired
	EmployeeRepository eRepo;
	
	@RequestMapping("/")
	public String index(Model model){
		currentEmp = eRepo.findByCode("1001");
		long count = eRepo.count();
		model.addAttribute("emp", currentEmp);
		model.addAttribute("count", count);
		return "index";
	}
}
