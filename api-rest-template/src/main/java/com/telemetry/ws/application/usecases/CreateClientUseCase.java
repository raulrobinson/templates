package com.telemetry.ws.application.usecases;

import com.telemetry.ws.application.dto.ClientRequestDto;
import com.telemetry.ws.domain.model.ClientDomain;
import com.telemetry.ws.domain.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateClientUseCase {

    private final ClientRepository clientRepository;

    public CreateClientUseCase(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public ClientDomain execute(ClientRequestDto client) {
        return clientRepository.create(client);
    }

}
