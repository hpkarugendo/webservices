package ie.dit.dt354;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ie.dit.dt354.model.Department;
import ie.dit.dt354.model.Employee;
import ie.dit.dt354.model.EmployeeEnote;
import ie.dit.dt354.model.Enote;
import ie.dit.dt354.repository.DepartmentRepository;
import ie.dit.dt354.repository.EmployeeEnoteRepository;
import ie.dit.dt354.repository.EmployeeRepository;
import ie.dit.dt354.repository.EnoteRepository;

@SpringBootApplication
public class Dt354Application {

	public static void main(String[] args) {
		SpringApplication.run(Dt354Application.class, args);
	}
	
//	@Bean
//	CommandLineRunner runner(
//	DepartmentRepository dRepo, EmployeeRepository eRepo, EnoteRepository nRepo, EmployeeEnoteRepository enRepo) {
//		return args -> {
//			Arrays.asList("Management, Restaurant, Resception, Reservations".split(","))
//			.forEach(n -> dRepo.save(new Department(n)));
//			System.out.println("-Departments-----");
//			dRepo.findAll().forEach(System.out::println);
//			Department department = dRepo.findByName("Management");
//			Employee employee = new Employee();
//			employee.setCode("1001");
//			employee.setDepartment(department);
//			employee.setName("Mary Sue");
//			employee.setEmail("mary@email.dit");
//			employee.setPhone("01456764432");
//			employee.setPosition("MANAGER");
//			eRepo.save(employee);
//			employee = new Employee();
//			employee.setCode("2001");
//			employee.setDepartment(department);
//			employee.setName("Kent Sue");
//			employee.setEmail("kent@email.dit");
//			employee.setPhone("01456764432");
//			employee.setPosition("SUPERVISOR");
//			eRepo.save(employee);
//			employee = new Employee();
//			employee.setCode("3001");
//			employee.setDepartment(department);
//			employee.setName("Ben Sue");
//			employee.setEmail("ben@email.dit");
//			employee.setPhone("013343432");
//			employee.setPosition("WAITER");
//			eRepo.save(employee);
//			
//			Enote note1 = new Enote("Grettings", "Hello");
//			nRepo.save(note1);
//			note1 = new Enote("Grettings", "Hi there");
//			nRepo.save(note1);
//			note1 = new Enote("Grettings", "Hi Can I join too?");
//			nRepo.save(note1);
//			
//			System.out.println("-Notes-----");
//			nRepo.findAll().forEach(System.out::println);
//			
//			System.out.println("-Employees-----");
//			eRepo.findAll().forEach(System.out::println);
//			
//			Employee emp1 = eRepo.findByCode("1001");
//			Employee emp2 = eRepo.findByCode("2001");
//			Employee emp3 = eRepo.findByCode("3001");
//			Enote n1 = nRepo.findOne(1L);
//			Enote n2 = nRepo.findOne(2L);
//			Enote n3 = nRepo.findOne(3L);
//			
//			EmployeeEnote empNote1 = new EmployeeEnote(emp1, emp2, n1);
//			enRepo.save(empNote1);
//			EmployeeEnote empNote2 = new EmployeeEnote(emp2, emp1, n2);
//			enRepo.save(empNote2);
//			EmployeeEnote empNote3 = new EmployeeEnote(emp3, emp1, n3);
//			enRepo.save(empNote3);
//			
//			System.out.println("-Employee Notes-----");
//			enRepo.findAll().forEach(System.out::println);
//			
//			System.out.println("-Mary's Notes---Sent--");
//			if(nRepo.findByNoteFrom("1001").isEmpty()){
//				System.out.println("Mayu didn't send any notes");
//			} else {
//				nRepo.findByNoteFrom("1001").forEach(System.out::println);
//			}
//			
//			System.out.println("-Mary's Notes---Recieved--");
//			if(nRepo.findByNoteTo("1001").isEmpty()){
//				System.out.println("Mayu hasn't gotten any notes");
//			} else {
//				nRepo.findByNoteTo("1001").forEach(System.out::println);
//			}
//			
//		};
//	}
}
