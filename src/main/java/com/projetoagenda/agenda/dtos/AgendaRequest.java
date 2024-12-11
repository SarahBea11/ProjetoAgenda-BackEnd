package com.projetoagenda.agenda.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AgendaRequest(
    @NotNull(message = "namecommitment não pode ser nulo")
    String namecommitment,
    @NotBlank(message = "localcommitment não pode ser nulo")
    String localcommitment,
    @NotBlank(message = "Date não pode ser nulo")
    String date
) {
    
}
