package ie.dit.dt354.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ie.dit.dt354.model.User;

public interface UserRepository extends CrudRepository<User, Long>{
	User findByEmail(String email);
	List<User> findAll();
}
