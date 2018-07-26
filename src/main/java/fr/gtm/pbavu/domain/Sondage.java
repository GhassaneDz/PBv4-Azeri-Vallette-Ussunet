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

	/**
	 * 
	 * @return date de début du Sondage
	 */
	public LocalDate getDateDebut() {
		return dateDebut;
	}

	/**
	 * 
	 * @param dateDebut debut du sondage
	 */
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * 
	 * @return date fin du sondage
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}

	/**
	 * 
	 * @param dateFin date fin du sondage
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * 
	 * @return date fermetuer du sondage
	 */
	public LocalDate getDateFermeture() {
		return dateFermeture;
	}
	
	/**
	 * 
	 * @param dateFermeture date fermeture du sondage
	 */
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
