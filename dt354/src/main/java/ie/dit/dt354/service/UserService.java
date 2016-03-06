package ie.dit.dt354.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ie.dit.dt354.model.User;
import ie.dit.dt354.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository uRepo;
	
	public User findUser(String email) {
		if(uRepo.findAll().size() < 1) {
			User user = new User("henry@dit.ie", "henry");
			uRepo.save(user);
		}
		
		
		return uRepo.findByEmail(email);
	}
}
