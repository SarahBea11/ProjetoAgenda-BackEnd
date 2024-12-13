package com.projetoagenda.agenda.mappers;

import com.projetoagenda.agenda.dtos.AgendaRequest;
import com.projetoagenda.agenda.dtos.AgendaResponse;
import com.projetoagenda.agenda.entities.Agenda;

public class AgendaMapper {
    
    public static AgendaResponse toDTO(Agenda agenda){
        return new AgendaResponse (agenda.getId(),
        agenda.getNamecommitment(),
        agenda.getLocalcommitment(),
        agenda.gethoracommitment(),
        agenda.getDate());
    }

    public static Agenda toEntity(AgendaRequest agendaRequest){
        Agenda agenda = new Agenda();
        agenda.setNamecommitment(agendaRequest.namecommitment());
        agenda.setLocalcommitment(agendaRequest.localcommitment());
        agenda.sethoracommitment(agendaRequest.horacommitment());
        agenda.setDate(agendaRequest.date());

        return agenda;
    }
}
