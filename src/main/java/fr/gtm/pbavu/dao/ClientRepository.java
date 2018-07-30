package fr.gtm.pbavu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import fr.gtm.pbavu.domain.Client;

/**
 * L'interface ClientRepository permet d'accorder une entité Client à un JPA repository 
 * @author AZERI-VALLETTE-USSUNET
 *
 */

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

	
//	public Client findByNumero(String numero);
	
	@Query (value = "SELECT * FROM `client` WHERE `numero`=?1", nativeQuery = true)
	Client findByNumero(String numero);

}
