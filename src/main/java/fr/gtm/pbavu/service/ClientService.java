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
	private ClientRepository repo;
	@Autowired
	private ReponseService repservice;

	@Autowired
	private SondageService sonService;
	
	public Client createClientRep(final Client client) {
		final Client result = null;
		//sauvegardé le client
		this.repo.save(client);
		//creer une reponse positive avec ce client 
		Reponse reponsePositive = new Reponse();
		reponsePositive.setClient(client);
		reponsePositive.setStatut(true);
		//persister la reponse
		this.repservice.create(reponsePositive);	
		
		return result;
	}
	
	/**
	 * Vérifier numero de compte et creer une reponse avec le client récupéré du DAO
	 * si ok sinon retourne false
	 *
	 * @param numero
	 * @return
	 */
	public Client verfierNumero(final String numero) {

		Client result = new Client();
		final Client existClient = this.repo.findByNumero(numero);

		ClientService.LOGGER.debug("Je recherche " + numero + " " + existClient);

		if (existClient != null) {

			// créer une réponse
			final Reponse reponse = new Reponse();
			reponse.setStatut(true);
			// lui attribuer un client
			reponse.setClient(existClient);
			final LocalDate actualDate = LocalDate.now();
			reponse.setSondage(this.sonService.getActualSondage(actualDate));
			ClientService.LOGGER.debug("JESUISPASSSSSSSSSSSS");
			this.repservice.create(reponse);
			result = existClient;
		}

		return result;
	}

}
