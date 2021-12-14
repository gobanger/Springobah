package fr.solutec.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Memo;
import fr.solutec.entities.Person;
import fr.solutec.repository.MemoRepository;
import fr.solutec.repository.PersonRepository;

@RestController @CrossOrigin("*")
public class MemoRest {
	
	@Autowired
	private MemoRepository memoRepo;
	
	@PostMapping("note")
	public Memo createMemo(@RequestBody Memo m) {
		return memoRepo.save(m);
	}
	
/*	@GetMapping("memo/user/{id}")
	public List<Memo> voirNotes(Person p){
		return memoRepo.findByPersonId(p.getId());
	}*/

}
