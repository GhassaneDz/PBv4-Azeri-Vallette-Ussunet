package fr.gtm.pbavu.service;

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

	/**
	 * Vérifier numero de compte et creer une reponse avec le client récupéré du DAO
	 * si ok sinon retourne false
	 * 
	 * @param numero
	 * @return
	 */
	public boolean verfierNumero(final String numero) {

		boolean result = false;
		final Client existClient = this.repo.findByNumero(numero);

		ClientService.LOGGER.debug("Je recherche " + numero + " " + existClient);

		if (existClient != null) {
			// créer une réponse
			final Reponse reponse = new Reponse();
			// lui attribuer un client
			reponse.setClient(existClient);
			ClientService.LOGGER.debug("JESUISPASSSSSSSSSSSS");
			this.repservice.create(reponse);
			result = true;
		}

		return result;
	}

}
