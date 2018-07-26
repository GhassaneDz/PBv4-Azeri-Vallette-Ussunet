package fr.gtm.pbavu.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe représentant le Client de la banque (détenteur d'un compte client).
 *
 * @author AZERI-VALLETTE-USSUNET
 *
 */

@Entity
public class Client implements fr.gtm.pbavu.domain.Entity {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = true)
	private String mail;

	@Column
	private String name;

	@Column(nullable = true)
	private String numero;
	@Column
	private String prenom;

	@Column(nullable = true)
	private String telephone;

	/**
	 * Constructeur par défaut
	 */
	public Client() {
	}

	@Override
	public Integer getId() {
		return this.id;
	}

	/**
	 *
	 * @return le mail du client
	 */
	public String getMail() {
		return this.mail;
	}

	/**
	 *
	 * @return le nom du client
	 */
	public String getName() {
		return this.name;
	}

	/**
	 *
	 * @return le numero d'identification du client
	 */
	public String getNumero() {
		return this.numero;
	}

	/**
	 *
	 * @return prénom du client
	 */
	public String getPrenom() {
		return this.prenom;
	}

	/**
	 *
	 * @return téléphone du client
	 */
	public String getTelephone() {
		return this.telephone;
	}

	@Override
	public void setId(final Integer id) {
		this.id = id;
	}

	/**
	 *
	 * @param mail
	 *            l'adresse mail du client
	 */
	public void setMail(final String mail) {
		this.mail = mail;
	}

	/**
	 *
	 * @param name
	 *            nom de client
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 *
	 * @param numero
	 *            numéro d'authentification du client
	 */
	public void setNumero(final String numero) {
		this.numero = numero;
	}

	/**
	 *
	 * @param prenom
	 *            prénom du client
	 */
	public void setPrenom(final String prenom) {
		this.prenom = prenom;
	}

	/**
	 *
	 * @param telephone
	 *            téléphone de client
	 */
	public void setTelephone(final String telephone) {
		this.telephone = telephone;
	}

}
