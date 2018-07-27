package fr.gtm.pbavu.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.gtm.pbavu.domain.Reponse;

public interface ReponseRepository extends JpaRepository<Reponse, Integer> {
	@Query(value = " SELECT * FROM `reponse` WHERE `id_sondage`=?1 AND status` = 0 ", nativeQuery = true)
	List<Reponse> findRepoByNeg(Integer id);

	@Query(value = " SELECT * FROM `reponse` WHERE `id_sondage`=?1 AND `status` = 1 ", nativeQuery = true)
	List<Reponse> findRepoByPos(Integer id);

}
