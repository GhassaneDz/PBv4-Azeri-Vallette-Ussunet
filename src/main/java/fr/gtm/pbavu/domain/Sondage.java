package fr.gtm.pbavu.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.lang.annotation.Annotation;
import java.time.LocalDate;

/**
 * Classe représentant les sondages lancés par la banque sur une durée déterminée
 * @author Arnaud
 *
 */
@Entity
public class Sondage implements Entity {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private LocalDate dateDebut;
	private LocalDate dateFin;
	private LocalDate dateFermeture;
	
	

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	public LocalDate getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	public LocalDate getDateFermeture() {
		return dateFermeture;
	}

	public void setDateFermeture(LocalDate dateFermeture) {
		this.dateFermeture = dateFermeture;
	}

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
