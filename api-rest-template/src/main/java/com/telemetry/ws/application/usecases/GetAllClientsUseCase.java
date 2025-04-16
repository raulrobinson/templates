package com.telemetry.ws.application.usecases;

import com.telemetry.ws.domain.model.ClientDomain;
import com.telemetry.ws.domain.repository.ClientRepository;
import com.telemetry.ws.infrastructure.shared.exception.NoContentException;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllClientsUseCase {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(GetAllClientsUseCase.class);

    private final ClientRepository clientRepository;

    public GetAllClientsUseCase(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<ClientDomain> handle() {
        List<ClientDomain> clients = clientRepository.getAll();
        if (clients.isEmpty()) throw new NoContentException("No clients found", "NO_CONTENT");
        log.info("Found {} clients", clients.size());
        return clients;
    }
}
