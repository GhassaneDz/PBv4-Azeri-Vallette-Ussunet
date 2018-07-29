package fr.gtm.pbavu.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.gtm.pbavu.domain.Reponse;
import fr.gtm.pbavu.service.ReponseService;

/**
 * Classe représentant le web-service de la Classe Reponse.
 *
 * @author AZERI-VALLETTE-USSUNET
 *
 */

@Controller
@CrossOrigin(origins = "*")
@RequestMapping("/reponse")
public class ReponseController {

	@Autowired
	private ReponseService reponseService;

	/**
	 * Crée une réponse négative lors de la soumission du formulaire "Commentaire"
	 *
	 * @param commentaire
	 *            Commentaire renseigné par le client (peut être null).
	 * @param id
	 *            Identifiant du sondage en cours.
	 * @return Reponse Créé une nouvelle réponse.
	 */
	@PostMapping("/negative/{id}")
	public String createNegativeReponse(@RequestParam("commentaire") final String commentaire,
			@PathVariable final Integer id) {
		
		final Reponse reponse = new Reponse();
		reponse.setStatut(false);
		reponse.setCommentaire(commentaire);
		this.reponseService.createReponse(reponse, id);
		return "Reponse négative crée avec succès";
	}

}