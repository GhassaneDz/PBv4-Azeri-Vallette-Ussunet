package fr.gtm.pbavu.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.gtm.pbavu.dao.ClientRepository;
import fr.gtm.pbavu.domain.Client;
import fr.gtm.pbavu.domain.Reponse;

/**
 * Classe représentant le Client service.
 *
 * @author AZERI-VALLETTE-USSUNET
 *
 */

@Service
public class ClientService extends CRUDService<Client> {

	@Autowired
	private ClientRepository repo;
	
	@Autowired
	private ReponseService repservice;
	
	/**
	 * Vérifier numero de compte et creer une reponse avec le client récupéré du DAO si ok
	 * sinon retourne false
	 * @param numero
	 * @return
	 */
	public boolean verfierNumero(String numero) {
	 
		boolean result =false;
		Client existClient = this.repo.findByNumero(numero);
		
		if (existClient != null) {
			//créer une réponse
			Reponse reponse = new Reponse();
			//lui attribuer un client
			reponse.setClient(existClient);
			
			this.repservice.create(reponse);
			result = true; 
		}
		
		return result;
	}
	
	
	
	
	
	
	


}
