package fr.gtm.pbavu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.gtm.pbavu.domain.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

	
	public Client findByNumero(String numero);

}
