package fr.gtm.pbavu.service;


import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	private static final Logger LOGGER = LoggerFactory.getLogger(ClientService.class);

	@Autowired
	private SondageService sonService;
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
		
		 LOGGER.debug("Je recherche "+numero+existClient);
		 
		if (existClient != null) {
			//créer une réponse
			Reponse reponse = new Reponse();
			reponse.setStatut(true);
			//lui attribuer un client
			reponse.setClient(existClient);
			LocalDate actualDate = LocalDate.now();
			reponse.setSondage(this.sonService.getActualSondage(actualDate));
			LOGGER.debug("JESUISPASSSSSSSSSSSS");
			this.repservice.create(reponse);
			result = true; 
		}
		
		return result;
	}
	
	
	
	
	
	
	


}
