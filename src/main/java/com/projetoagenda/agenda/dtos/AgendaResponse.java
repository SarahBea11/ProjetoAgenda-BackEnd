package com.projetoagenda.agenda.dtos;

public record AgendaResponse(
    Long id,
    String namecommitment,
    String localcommitment,
    String date
) {
    
}
