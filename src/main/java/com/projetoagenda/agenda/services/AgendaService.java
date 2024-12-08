package com.projetoagenda.agenda.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoagenda.agenda.dtos.AgendaResponse;
import com.projetoagenda.agenda.entities.Agenda;
import com.projetoagenda.agenda.mappers.AgendaMapper;
import com.projetoagenda.agenda.repositories.AgendaRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class AgendaService {
    
    @Autowired
    private AgendaRepository repository;

    public List<AgendaResponse> getAllAgenda(){
        return repository.findAll().stream()
                                   .map(p -> AgendaMapper.toDTO(p))
                                   .collect(Collectors.toList());
    }

    public AgendaResponse getAgendaById(long id){
        Agenda agenda = repository.findById(id).orElseThrow(
        () -> new EntityNotFoundException("Compromisso não encontrado"));

        return AgendaMapper.toDTO(agenda);
    }
}
