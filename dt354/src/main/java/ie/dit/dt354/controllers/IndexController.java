package ie.dit.dt354.controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ie.dit.dt354.model.Employee;
import ie.dit.dt354.model.User;
import ie.dit.dt354.repository.EmployeeRepository;
import ie.dit.dt354.repository.UserRepository;

@Controller
public class IndexController {
	@Autowired
	UserRepository uRepo;
	@Autowired
	EmployeeRepository eRepo;
	
	@RequestMapping(value={"/", "/index"})
	public String index(@ModelAttribute User user, Model model){
		model.addAttribute("messageB", "");
		model.addAttribute("messageG", "");
		model.addAttribute("user", user);
		return "index";
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public String addEmployee(@ModelAttribute User user, Model model){
		Employee emp = null;
		emp = eRepo.findByEmail(user.getEmail());
		List<String> errors = new ArrayList<String>();
		if(!user.getPassword().equals(user.getPassword2())){
				String error = "Oops, something went wrong";
				model.addAttribute("messageB", error);
			return "redirect:index";
		} else {
			uRepo.save(user);
			model.addAttribute("messageG", "You have been successfully signed up. Now login to continue");
			return "employees_all";
		}
	}
}
