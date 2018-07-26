package fr.gtm.pbavu.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.gtm.pbavu.service.SondageService;

@Controller
@RequestMapping("/sondage")
public class SondageController {

	private SondageService sondageService;

}
