package com.projetoagenda.agenda.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoagenda.agenda.dtos.AgendaResponse;
import com.projetoagenda.agenda.mappers.AgendaMappers;
import com.projetoagenda.agenda.repositories.AgendaRepository;

@Service
public class AgendaService {
    
    @Autowired
    private AgendaRepository repository;

    public List<AgendaResponse> getAllAgenda(){
        return repository.findAll().stream()
                                   .map(p -> AgendaMappers.toDTO(p))
                                   .collect(Collectors.toList());
    }
}
