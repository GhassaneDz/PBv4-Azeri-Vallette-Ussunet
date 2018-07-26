package domain;

/**
 * 
 * @author Adminl
 *
 */
public class Reponse implements Entity{

	private Integer id;
	private Boolean statut;
	private String commentaire;
	private Client client;
	private Sondage sondage;
	
	
	@Override
	public Integer getId() {
		return this.id;
	}
	@Override
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getStatut() {
		return statut;
	}
	public void setStatut(Boolean statut) {
		this.statut = statut;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Sondage getSondage() {
		return sondage;
	}
	public void setSondage(Sondage sondage) {
		this.sondage = sondage;
	}

	
}
