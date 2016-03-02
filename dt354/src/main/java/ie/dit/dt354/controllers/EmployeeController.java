package ie.dit.dt354.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ie.dit.dt354.model.Employee;
import ie.dit.dt354.repository.EmployeeRepository;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeRepository eRepo;
	Employee newEmp, emp;
	
	@RequestMapping(value="/employees/new", method=RequestMethod.POST)
	public String addEmployee(@ModelAttribute Employee emp0, Model model, @RequestParam("file") MultipartFile file,
			   RedirectAttributes redirectAttributes){
		newEmp = emp0;
		String avatar = "";
		if (file.getName().contains("/")) {
			redirectAttributes.addFlashAttribute("message", "Folder separators not allowed");
			return "redirect:employees/new";
		}
		if (file.getName().contains("/")) {
			redirectAttributes.addFlashAttribute("message", "Relative pathnames not allowed");
			return "redirect:employees/new";
		}

		if (!file.isEmpty()) {
			try {
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(new File("src/main/resources/static/images/avatars/" + emp0.getCode() + file.getOriginalFilename())));
				avatar = emp0.getCode() + file.getOriginalFilename();
                FileCopyUtils.copy(file.getInputStream(), stream);
				stream.close();
				redirectAttributes.addFlashAttribute("message",
						"You successfully uploaded " + avatar + "!");
				newEmp.setAvatar(avatar);
				eRepo.save(newEmp);
			}
			catch (Exception e) {
				redirectAttributes.addFlashAttribute("message",
						"You failed to upload " + file.getName() + " => " + e.getMessage());
			}
		}
		else {
			redirectAttributes.addFlashAttribute("message",
					"You failed to upload " + file.getName() + " because the file was empty");
		}
		Employee aEmp = eRepo.findByCode(emp0.getCode());
		redirectAttributes.addAttribute("emp0", aEmp);

		return "redirect:index";
	}
	
	@RequestMapping(value="/employees/new", method=RequestMethod.GET)
	public String newEmployee(Model model){
		model.addAttribute("emp0", new Employee());
		
		return "employees_new";
	}
	
	@RequestMapping(value="/employees/index", method=RequestMethod.GET)
	public String allEmployees(Model model){
		model.addAttribute("employees", eRepo.findAll());
		long count = eRepo.count();
		model.addAttribute("count", count);
		model.addAttribute("emp0", new Employee());
		return "employees_all";
	}
}
