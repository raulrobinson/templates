package com.telemetry.ws.domain.repository;

import com.telemetry.ws.application.dto.ClientRequestDto;
import com.telemetry.ws.application.dto.PartialClientDto;
import com.telemetry.ws.domain.model.ClientDomain;

import java.util.List;

public interface ClientRepository {

    List<ClientDomain> getAll();
    ClientDomain getByClientCode(String clientCode);

    // Get clients by DNI
    ClientDomain getClientByDni(String dni);

    ClientDomain create(ClientRequestDto client);
    ClientDomain update(String clientCode, ClientRequestDto clientDto);
    ClientDomain partialUpdate(String clientCode, PartialClientDto client);
    void deleteByClientCode(String clientCode);
}
