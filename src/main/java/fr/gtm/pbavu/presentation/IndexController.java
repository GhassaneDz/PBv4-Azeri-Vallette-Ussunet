package fr.gtm.pbavu.presentation;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.gtm.pbavu.domain.Sondage;
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
	private SondageService sondService;

	/**
	 * permet l'ffaichage de la JSP index (dashboard gestion sondage) sur l'url / ou
	 * /index
	 *
	 * @return la page Index.html
	 */
	@RequestMapping({ "/index", "/" })
	public String index(final Model model) {
		final List<Sondage> sondages = this.sondService.getList();

		IndexController.LOGGER.debug("CONTROL j'ai mis les sondages dans le model");
		model.addAttribute("sondages", sondages);

		return "index";
	}

}
