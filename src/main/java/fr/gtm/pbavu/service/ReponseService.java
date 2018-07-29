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

	@Autowired
	private SondageService sondageService;

	public Reponse createReponseNegative(final Reponse reponse, final Integer id) {
		final Sondage sondage = this.sondageService.read(id);
		reponse.setSondage(sondage);
		reponse.setStatut(false);
		return this.save(reponse);
	}

	public Integer nouvClientReponse(final Integer id) {
		final Integer result;
		result = this.repo.findNewClientRep(id);
		return result;
	}

	public Integer reponseNegatif(final Integer id) {
		final Integer result = this.repo.findRepoByNeg(id).size();
		return result;
	}

	public Integer reponsePositif(final Integer id) {
		final Integer result = this.repo.findRepoByPos(id).size();

		return result;
	}

}
