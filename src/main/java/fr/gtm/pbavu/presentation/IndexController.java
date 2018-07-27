package fr.gtm.pbavu.presentation;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import fr.gtm.pbavu.domain.Sondage;
import fr.gtm.pbavu.service.ClientService;
import fr.gtm.pbavu.service.ReponseService;
import fr.gtm.pbavu.service.SondageService;

/**
 *
 * @author AZERI-VALLETTE-USSUNET
 *
 */

@Controller
public class IndexController {

	private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

	@Autowired
	private ClientService clientService;

	@Autowired
	private ReponseService repService;

	@Autowired
	private SondageService sondService;

	// TODO creation du POSTMAPPING creation d'un sondage
	@PostMapping({ "/index", "/" })
	public String creatSondage(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") final LocalDate dateDebut,
			@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") final LocalDate dateFin) {

		final Sondage sondage = new Sondage();
		sondage.setDateDebut(dateDebut);
		sondage.setDateFin(dateFin);
		this.sondService.create(sondage);
		return "redirect:/index.html";
	}

	// TODO postMapping suppression d'un sondage
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable final Integer id) {
		this.sondService.delete(id);
	}

	// TODO Détail d'un sondage
	@RequestMapping({ "/detail" })
	public String detail(@RequestParam("id") final Integer idSondage, final Model model) {
		// avis positif
		final Integer aviOk = this.repService.reponsePositif(idSondage);
		// avis negatif
		final Integer aviNot = this.repService.reponseNegatif(idSondage);
		// nbre de nouveau client
		final Integer nbClient = this.repService.nouvClientReponse(idSondage);
		model.addAttribute("idSond", idSondage);
		model.addAttribute("aviOk", aviOk);
		model.addAttribute("aviNot", aviNot);
		model.addAttribute("nbClient", nbClient);
		return "detail";
	}

	// TODO postMapping fermeture d'un sondage

	/**
	 * permet l'ffaichage de la JSP index (dashboard gestion sondage) sur l'url / ou
	 * /index
	 *
	 * @return la page Index.html
	 */
	@RequestMapping({ "/index", "/" })
	public String index(final Model model) {
		final List<Sondage> sondages = this.sondService.getList();
		// final Integer reponses = this.sondService.totalReponse(reponses);

		IndexController.LOGGER.debug("CONTROL j'ai mis les sondages dans le model");
		model.addAttribute("sondages", sondages);
		// model.addAttribute("reponses", reponses);

		return "index";
	}

}
