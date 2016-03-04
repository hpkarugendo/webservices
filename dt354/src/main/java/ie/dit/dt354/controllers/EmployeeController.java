package ie.dit.dt354.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ie.dit.dt354.model.Department;
import ie.dit.dt354.model.Employee;
import ie.dit.dt354.repository.DepartmentRepository;
import ie.dit.dt354.repository.EmployeeRepository;
import ie.dit.dt354.service.DepartmentService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeRepository eRepo;
	@Autowired
	DepartmentService dRepo;
	Employee newEmp, emp;
	
	@RequestMapping(value="/employees/new", method=RequestMethod.POST)
	public String addEmployee(@ModelAttribute Employee emp0, Model model,
			   RedirectAttributes redirectAttributes){
		newEmp = emp0;
			try {
				eRepo.save(newEmp);
				redirectAttributes.addFlashAttribute("message",
						"You successfully added " + emp0.getName() + "!");
				
			}
			catch (Exception e) {
				redirectAttributes.addFlashAttribute("message",
						"Something went wrong saving " + emp0.getName() + " => " + e.getMessage());
			}

		return "redirect:index";
	}
	
	@RequestMapping(value="/employees/new", method=RequestMethod.GET)
	public String newEmployee(Model model){
		model.addAttribute("emp0", new Employee());
		model.addAttribute("deps", dRepo.getDepartments());
		
		return "employees_new";
	}
	
	@RequestMapping(value="/employees/index", method=RequestMethod.GET)
	public String allEmployees(Model model){
		model.addAttribute("employees", eRepo.findAll());
		long count = eRepo.count();
		model.addAttribute("count", count);
		return "employees_all";
	}
}
