package fr.gtm.pbavu.service;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.gtm.pbavu.dao.SondageRepository;
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

	@Override
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

}
