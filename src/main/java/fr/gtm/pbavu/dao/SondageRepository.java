package fr.gtm.pbavu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.gtm.pbavu.domain.Sondage;

public interface SondageRepository extends JpaRepository<Sondage, Integer> {

}
