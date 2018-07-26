package fr.gtm.pbavu.presentation;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.gtm.pbavu.domain.Client;
import fr.gtm.pbavu.service.ClientService;

/**
 * Classe représentant le web service de la classe Client.
 *
 * @author AZERI-VALLETTE-USSUNET
 *
 */

@Controller
@RequestMapping("/client")
public class ClientController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ClientController.class);

	@Autowired
	private ClientService service;

	/**
	 * 
	 * @param client
	 *            client de type Client
	 * @return crée un nouveau client
	 */
	@PostMapping("/creation/{id}")
	@ResponseBody
	public Client add(@RequestBody final Client client) {
		ClientController.LOGGER.debug("Client ajouter !!", client.getName(), client.getPrenom(), client.getMail(),
				client.getNumero());

		return this.service.create(client);
	}

<<<<<<< HEAD
=======
	/**
	 * 
	 * @param id
	 *            identifiant du client
	 * @return un client
	 */
>>>>>>> 503158ce1d0bdcf502d8415c90c4aea36197fc47
	@PostMapping("/get/{id}")
	@ResponseBody
	public Client get(@PathVariable final Integer id) {

		return this.service.read(id);
	}

<<<<<<< HEAD
=======
	/**
	 * 
	 * @return liste des clients
	 */
>>>>>>> 503158ce1d0bdcf502d8415c90c4aea36197fc47
	@RequestMapping({ "/list", "/" })
	@ResponseBody
	public List<Client> list() {
		ClientController.LOGGER.debug("Controller client OK OK");
		return this.service.getList();
	}

}
