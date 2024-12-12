package com.projetoagenda.agenda.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AgendaRequest(
    @NotNull(message = "Nome não pode ser nulo")
    String namecommitment,
    @NotBlank(message = "Local não pode ser nulo")
    String localcommitment,
    @NotBlank(message = "Data não pode ser nulo")
    String date
) {
    
}
