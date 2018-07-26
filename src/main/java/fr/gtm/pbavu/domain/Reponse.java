package fr.gtm.pbavu.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import fr.gtm.pbavu.domain.Client;

/**
 *
 * @author Adminl
 *
 */

@Entity
public class Reponse implements fr.gtm.pbavu.domain.Entity {

	@OneToOne
	@JoinColumn(name="id_client", referencedColumnName="id", nullable=true)
	private Client client;
	
	@Column(nullable=true)
	private String commentaire;
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="id_sondage", referencedColumnName="id")
	private Sondage sondage;
	
	@Column
	private Boolean statut;

	public Client getClient() {
		return this.client;
	}

	public String getCommentaire() {
		return this.commentaire;
	}

	@Override
	public Integer getId() {
		return this.id;
	}

	public Sondage getSondage() {
		return this.sondage;
	}

	public Boolean getStatut() {
		return this.statut;
	}

	public void setClient(final Client client) {
		this.client = client;
	}

	public void setCommentaire(final String commentaire) {
		this.commentaire = commentaire;
	}

	@Override
	public void setId(final Integer id) {
		this.id = id;
	}

	public void setSondage(final Sondage sondage) {
		this.sondage = sondage;
	}

	public void setStatut(final Boolean statut) {
		this.statut = statut;
	}

}
