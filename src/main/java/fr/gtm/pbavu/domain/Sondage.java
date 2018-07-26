package fr.gtm.pbavu.domain;

import java.time.LocalDate;

/**
 * Classe représentant les sondages lancés par la banque sur une durée déterminée
 * @author Arnaud
 *
 */
public class Sondage implements Entity {
	
	private Integer id;
	private LocalDate dateDebut;
	private LocalDate dateFin;
	private LocalDate dateFermeture;
	
	
	@Override
	public Integer getId() {
		return id;
	}

	@Override
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
	
	
	
}
