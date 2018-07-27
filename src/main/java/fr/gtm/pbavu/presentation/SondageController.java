package fr.gtm.pbavu.presentation;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.gtm.pbavu.domain.Sondage;
import fr.gtm.pbavu.service.SondageService;

/**
 * Classe représentant le web-service de la class Sondage.
 *
 * @author AZERI-VALLETTE-USSUNET
 *
 */

@Controller
@RequestMapping("/sondage")
public class SondageController {

	@Autowired
	private SondageService sondageService;

	/**
	 * 
	 * @return la date de debut et fin du sondage en cours
	 */
	@GetMapping("")
	public String checkSondage() {
		String result = null;
		final LocalDate actualDate = LocalDate.now();
		final Sondage actualSondage = this.sondageService.getActualSondage(actualDate);
		if (actualSondage != null) {
			result = "Succès sondage : " + actualSondage.getId() + " a commencé le " + actualSondage.getDateDebut()
					+ " et se termine le " + actualSondage.getDateFermeture();
		} else {
			result = "Pas de sondage en cours";
		}
		return result;
	}
	

}
