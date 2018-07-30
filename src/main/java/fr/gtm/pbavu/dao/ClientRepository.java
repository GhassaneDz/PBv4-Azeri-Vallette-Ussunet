package fr.gtm.pbavu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import fr.gtm.pbavu.domain.Client;

/**
 * L'interface ClientRepository permet d'accorder une entité Client à un JPA
 * repository
 * 
 * @author AZERI-VALLETTE-USSUNET
 *
 */

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

	/**
	 * Requête permettant de renvoyer un client existant grâce à son numero client
	 * 
	 * @param numero
	 * @return
	 */
	@Query(value = "SELECT * FROM `client` WHERE `numero`=?1", nativeQuery = true)
	Client findByNumero(String numero);

}
