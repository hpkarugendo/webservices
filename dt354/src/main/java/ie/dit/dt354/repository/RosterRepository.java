package ie.dit.dt354.repository;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

import ie.dit.dt354.model.Roster;

public interface RosterRepository extends CrudRepository<Roster, Long>{
	Collection<Roster> findByRosterDeptName(String department);
}
