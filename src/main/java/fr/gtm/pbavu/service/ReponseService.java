package fr.gtm.pbavu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.gtm.pbavu.dao.ReponseRepository;
import fr.gtm.pbavu.domain.Reponse;
import fr.gtm.pbavu.domain.Sondage;

/**
 *
 * 
 * @author AZERI-VALLETTE-USSUNET
 *
 */

@Service
public class ReponseService extends CRUDService<Reponse> {
	@Autowired
	private ReponseRepository repo;
	
	public Integer reponsePositif(final Integer id) {
		final Integer result = this.repo.findRepoByPos(id).size();
		return result;
}
	
	public Integer reponseNegatif(final Integer id) {
		final Integer result = this.repo.findRepoByNeg(id).size();
		return result;
}
	

	@Autowired
	private SondageService sondageService;

	public Reponse createReponse(final Reponse reponse, final Integer id) {
		final Sondage sondage = this.sondageService.read(id);
		reponse.setSondage(sondage);
		return this.save(reponse);
	}
}
