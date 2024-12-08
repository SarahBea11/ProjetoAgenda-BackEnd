package com.projetoagenda.agenda.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.projetoagenda.agenda.dtos.AgendaResponse;
import com.projetoagenda.agenda.services.AgendaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("agenda")
public class AgendaController {
    
    @Autowired 
    private AgendaService service;

    @GetMapping
    public ResponseEntity<List<AgendaResponse>> getAgenda(){
        return ResponseEntity.ok(service.getAllAgenda());
    }


}
