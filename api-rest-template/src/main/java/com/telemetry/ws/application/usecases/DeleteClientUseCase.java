package com.telemetry.ws.application.usecases;

import com.telemetry.ws.domain.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class DeleteClientUseCase {

    private final ClientRepository clientRepository;

    public DeleteClientUseCase(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void execute(String clientCode) {
        clientRepository.deleteByClientCode(clientCode);
    }
}
