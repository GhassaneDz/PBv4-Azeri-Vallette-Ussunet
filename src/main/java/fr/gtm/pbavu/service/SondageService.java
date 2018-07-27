package fr.gtm.pbavu.service;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.gtm.pbavu.dao.SondageRepository;
import fr.gtm.pbavu.domain.Reponse;
import fr.gtm.pbavu.domain.Sondage;

/**
 *
 * @author AZERI-VALLETTE-USSUNET
 *
 */
@Service
public class SondageService extends CRUDService<Sondage> {

	private static final Logger LOGGER = LoggerFactory.getLogger(SondageService.class);

	@Autowired
	private SondageRepository repo;
	
	
	
	public Sondage create(final Sondage sondage) {
		return this.repo.save(sondage);
	}

	
	
	
	public Sondage getActualSondage(final LocalDate actualDate) {
		Sondage result = null;
		final List<Sondage> sondages = this.repo.findAll();
		for (final Sondage sondage : sondages) {
			if (actualDate.isAfter(sondage.getDateDebut()) && actualDate.isBefore(sondage.getDateFin())) {
				result = sondage;
			} else {
				result = null;
			}
		}
		return result;
	}

	
	public Integer totalReponse(List<Reponse> reponses) {
		Integer count = 0;

		for (Reponse reponse : reponses) {
			if (reponse.getStatut()) {
				count++;
			}
		}
		return count;
	}

	
	public void delete(final Integer id) {
		this.repo.deleteById(id);
		}

	
	public Integer nouveauClientCount(List<Reponse> reponses) {
		Integer count = 0;
		for (Reponse reponse : reponses) {
			if (reponse.getNouveauClient()) {
				count++;
			}
		}
		return count;
	}

}
