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
	
	
	
}
