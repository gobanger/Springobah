package fr.solutec.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryCreationException;

import fr.solutec.entities.Memo;

public interface MemoRepository extends CrudRepository<Memo, Long>{

	
	//public List<Memo> findByPersonId(Long id);
}
