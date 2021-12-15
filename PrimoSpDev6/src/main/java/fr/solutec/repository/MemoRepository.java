package fr.solutec.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryCreationException;

import fr.solutec.entities.Memo;
import fr.solutec.entities.Person;

public interface MemoRepository extends CrudRepository<Memo, Long>{

	
	public List<Memo> findByCreateur(Optional<Person> optional);
	
	//public void delete(Memo m);
	
	@Query(value="SELECT m FROM Memo m WHERE m.id=?1")
	public void deleteById(Optional<Memo> findById);
}
