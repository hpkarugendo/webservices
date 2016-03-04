package ie.dit.dt354.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ie.dit.dt354.model.Employee;
import ie.dit.dt354.model.User;
import ie.dit.dt354.repository.EmployeeRepository;
import ie.dit.dt354.repository.UserRepository;
import ie.dit.dt354.service.UserService;

@Controller
public class IndexController {
	@Autowired
	UserService uRepo;
	@Autowired
	EmployeeRepository eRepo;
	
	@RequestMapping(value={"/", "/index"})
	public String index(Model model){
		model.addAttribute("user", new User());
		return "index";
	}
	
	@RequestMapping(value="/login")
	public String addEmployee(@ModelAttribute User user, Model model, RedirectAttributes redirectAttributes){
		Employee emp = null;
		User user2 = null;
		user2 = uRepo.findUser(user.getEmail());
		if(user2 == null) {
			redirectAttributes.addFlashAttribute("message", "User not found. Please try again");
			return "redirect:index";
		} else {
			if(!user.getPassword().equals(user2.getPassword())) {
				redirectAttributes.addFlashAttribute("message", "Wrong password. Please try again!");
				return "redirect:index";
			}
			
		}
		emp = eRepo.findByEmail(user.getEmail());
		redirectAttributes.addAttribute("currentEmp", emp);
		return "redirect:/employees/index";
	}
}
