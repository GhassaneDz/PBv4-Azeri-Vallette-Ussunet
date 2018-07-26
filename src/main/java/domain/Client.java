package domain;

/**
 * Classe représentant le Client de la banque (détenteur d'un compte client).
 *
 * @author Adminl
 *
 */
public class Client implements Entity {

	private Integer id;
	private String mail;
	private String name;
	private String numero;
	private String prenom;
	private String telephone;

	public Client() {
	}

	@Override
	public Integer getId() {
		return this.id;
	}

	public String getMail() {
		return this.mail;
	}

	public String getName() {
		return this.name;
	}

	public String getNumero() {
		return this.numero;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public String getTelephone() {
		return this.telephone;
	}

	@Override
	public void setId(final Integer id) {
		this.id = id;
	}

	public void setMail(final String mail) {
		this.mail = mail;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public void setNumero(final String numero) {
		this.numero = numero;
	}

	public void setPrenom(final String prenom) {
		this.prenom = prenom;
	}

	public void setTelephone(final String telephone) {
		this.telephone = telephone;
	}

}
