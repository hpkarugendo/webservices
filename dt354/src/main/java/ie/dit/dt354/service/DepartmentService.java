package ie.dit.dt354.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ie.dit.dt354.model.Department;
import ie.dit.dt354.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	DepartmentRepository dRepo;
	
	public List<Department> getDepartments() {
		if(dRepo.findAll().isEmpty() || dRepo.findAll().size() < 1) {
			Department department = new Department("NA");
			dRepo.save(department);
			department = new Department("MANAGEMENT");
			dRepo.save(department);
			department = new Department("RESTAURANT");
			dRepo.save(department);
			department = new Department("RECEPTION");
			dRepo.save(department);
			department = new Department("ACCOUNTS");
			dRepo.save(department);
			department = new Department("SALES");
			dRepo.save(department);
			department = new Department("HR");
			dRepo.save(department);
		}
		
		return dRepo.findAll();
	}
	
	public Department findDepartment(String name) {
		return dRepo.findByName(name);
	}
}
