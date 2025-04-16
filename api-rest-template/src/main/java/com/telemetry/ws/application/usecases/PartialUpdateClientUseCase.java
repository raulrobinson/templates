package com.telemetry.ws.application.usecases;

import com.telemetry.ws.application.dto.PartialClientDto;
import com.telemetry.ws.domain.model.ClientDomain;
import com.telemetry.ws.domain.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class PartialUpdateClientUseCase {

    private final ClientRepository clientRepository;

    public PartialUpdateClientUseCase(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public ClientDomain execute(String clientCode, PartialClientDto client) {
        return clientRepository.partialUpdate(clientCode, client);
    }
}
