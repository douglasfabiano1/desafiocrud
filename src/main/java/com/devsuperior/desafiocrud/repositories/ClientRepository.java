package com.devsuperior.desafiocrud.repositories;

import com.devsuperior.desafiocrud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
