package com.telemetry.ws.application.mapper;

import com.telemetry.ws.application.dto.ClientDto;
import com.telemetry.ws.application.dto.ClientRequestDto;
import com.telemetry.ws.domain.model.ClientDomain;
import com.telemetry.ws.infrastructure.persistence.entity.ClientEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ClientMapper {

    ClientMapper INSTANCE = new ClientMapperImpl();

    ClientDomain toClientDomain(ClientEntity clientEntity);
    ClientEntity toClientEntity(ClientRequestDto clientRequestDto);
    ClientDto toClientDto(ClientDomain clientDomain);
    List<ClientDto> toClientDtoList(List<ClientDomain> clientDomainList);
}
