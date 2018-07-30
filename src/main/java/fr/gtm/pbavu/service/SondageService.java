package fr.gtm.pbavu.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.gtm.pbavu.dao.SondageRepository;
import fr.gtm.pbavu.domain.Sondage;

/**
 * Le SondageService est le service apparenté l'entité Sondage
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

	/**
	 * 
	 * cette methode permet de férmer un sondage ouvert
	 * @param id
	 *            l'id d'un sondage
	 * @param dateFermeture  date de fermiture d'un sondage
	 * @return false si il n'y a pas de sondage ouvert, true si il existe un sondage
	 *         ouvert
	 */
	public boolean fermetureSondage(final Integer id, final LocalDate dateFermeture) {
		boolean result = false;
		final Optional<Sondage> tempSondage;
		tempSondage = this.repo.findById(id);

		if (tempSondage.isPresent()) {
			final Sondage actualSondage = tempSondage.get();

			SondageService.LOGGER.debug("j'ai récupéré le sondage actuel");
			SondageService.LOGGER.debug("DAte de début de sondage recupérer !");
			// verifier si le sondage est en cours
			// si le sondage est en cours ajouter dateFermeture et return true
			if (dateFermeture.isAfter(actualSondage.getDateDebut())
					&& dateFermeture.isBefore(actualSondage.getDateFin())) {
				actualSondage.setDateFermeture(dateFermeture);
				this.edit(actualSondage);
				result = true;
			}
		}

		// si le sondage est déjà fermé return false
		return result;
	}

	/**
	 * cette methode vérifie s'il existe sondage ouvert a la date actuel
	 * @param actualDate la date actuel 
	 * @return le Sondage actuel
	 */
	public Sondage getActualSondage(final LocalDate actualDate) {
		Sondage result = null;
		final List<Sondage> sondages = this.repo.findAll();
		for (final Sondage sondage : sondages) {
			if (actualDate.isAfter(sondage.getDateDebut()) == true
					&& actualDate.isBefore(sondage.getDateFin()) == true) {
				SondageService.LOGGER.debug("j'ai parcouru un sondage");
				result = sondage;
			}
		}
		return result;
	}

}
