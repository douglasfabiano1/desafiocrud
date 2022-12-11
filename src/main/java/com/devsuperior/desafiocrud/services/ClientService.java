package com.devsuperior.desafiocrud.services;

import com.devsuperior.desafiocrud.dto.ClientDTO;
import com.devsuperior.desafiocrud.entities.Client;
import com.devsuperior.desafiocrud.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Optional<Client> result = repository.findById(id);
        Client client = result.get();
        ClientDTO dto = new ClientDTO(client);
        return dto;
    }
}
