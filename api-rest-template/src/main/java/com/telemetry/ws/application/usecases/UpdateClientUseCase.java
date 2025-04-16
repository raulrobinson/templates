package com.telemetry.ws.application.usecases;

import com.telemetry.ws.application.dto.ClientRequestDto;
import com.telemetry.ws.domain.model.ClientDomain;
import com.telemetry.ws.domain.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class UpdateClientUseCase {

    private final ClientRepository clientRepository;

    public UpdateClientUseCase(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public ClientDomain execute(String clientCode, ClientRequestDto client) {
        return clientRepository.update(clientCode, client);
    }
}
