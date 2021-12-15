package fr.solutec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.solutec.entities.Memo;
import fr.solutec.entities.Person;
import fr.solutec.repository.MemoRepository;
import fr.solutec.repository.PersonRepository;

@SpringBootApplication
public class PrimoSpDev6Application implements CommandLineRunner {
	@Autowired
	private PersonRepository personRepo;
	@Autowired
	private MemoRepository memoRepo;
	

	public static void main(String[] args) {
		SpringApplication.run(PrimoSpDev6Application.class, args);
		System.out.println("Lancement ok");
	}

	@Override
	public void run(String... args) throws Exception {
		Person p1  = new Person(null,"PATIEN","Mathis",57, "pm", "11");
		Person p2  = new Person(null,"Ta","Tou",4, "tt", "12");
		Person p3  = new Person(null,"CAGE","Nicolas",57, "gn", "13");
		
		Memo m1 = new Memo(null, "testoglob", true, "tt", p1);
		Memo m2 = new Memo(null, "testoglobo", false, null, p2);
		
		personRepo.save(p1);
		personRepo.save(p2);
		personRepo.save(p3);
		memoRepo.save(m1);
		memoRepo.save(m2);
		
	}

}
