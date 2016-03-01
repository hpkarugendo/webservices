package ie.dit.dt354.repository;

import org.springframework.data.repository.CrudRepository;

import ie.dit.dt354.model.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long>{
	Department findByName(String name);
}
