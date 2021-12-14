package fr.solutec.repository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
	
	public List<Person> findByNom(String nom);
	
	@Query(value="SELECT p FROM Person p WHERE p.nom=?1")
	public List<Person> getByNom(String nom);
	
	public List<Person> findByLogin(String login);
	public List<Person> findByPassword(String password);

}