package fr.gtm.pbavu.presentation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author AZERI-VALLETTE-USSUNET
 *
 */
@Controller
public class IndexController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);
	
	
	/**
	 * 
	 * @return la page Index.html
	 */
	@RequestMapping("/index")
	public ModelAndView index() {
		final ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	
}
