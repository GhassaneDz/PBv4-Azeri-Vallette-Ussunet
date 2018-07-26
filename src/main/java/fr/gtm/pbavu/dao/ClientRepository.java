package fr.gtm.pbavu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.gtm.pbavu.domain.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
