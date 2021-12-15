package fr.solutec.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor @AllArgsConstructor @Data
public class Memo {
	@Id @GeneratedValue
	private Long id;
	private String contenu;
	private Boolean status;
	@Column(nullable = true)
	private String loginDest;
	
	@ManyToOne
	private Person createur;

}
