package com.projetoagenda.agenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoagenda.agenda.entities.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {
    
}
