package com.projetoagenda.agenda.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import com.projetoagenda.agenda.dtos.AgendaRequest;
import com.projetoagenda.agenda.dtos.AgendaResponse;
import com.projetoagenda.agenda.services.AgendaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("agenda")
@CrossOrigin
public class AgendaController {
    
    @Autowired 
    private AgendaService service;

    @GetMapping
    public ResponseEntity<List<AgendaResponse>> getAgendas(){
        return ResponseEntity.ok(service.getAllAgenda());
    }

    @GetMapping("{id}")
    public ResponseEntity<AgendaResponse> getAgenda(@PathVariable long id){
        return ResponseEntity.ok(service.getAgendaById(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteAgenda(@PathVariable long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
    
    @PostMapping()
    public ResponseEntity<AgendaResponse> saveAgenda(@Validated @RequestBody AgendaRequest agenda){
        AgendaResponse newAgenda = service.save(agenda);
        return ResponseEntity.created(null).body(newAgenda);
    }

    @PutMapping("{id}")
    public ResponseEntity<Void> updateAgenda(@Validated @PathVariable long id, @RequestBody AgendaRequest agenda){
        service.update(agenda, id);
        return ResponseEntity.ok().build();
    }
}
