package fr.gtm.pbavu.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.gtm.pbavu.domain.Sondage;

@Service
public class SondageService extends CRUDService<Sondage> {

	public Sondage getActualSondage(final LocalDate actualDate) {
		Sondage result = null;
		final List<Sondage> sondages = this.getList();
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
