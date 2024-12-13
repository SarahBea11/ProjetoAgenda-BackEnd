package com.projetoagenda.agenda.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Agenda implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String namecommitment;
    private String localcommitment; 
    private String horacommitment; 
    private String date;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNamecommitment() {
        return namecommitment;
    }
    public void setNamecommitment(String namecommitment) {
        this.namecommitment = namecommitment;
    }
    public String getLocalcommitment() {
        return localcommitment;
    }
    public void setLocalcommitment(String localcommitment) {
        this.localcommitment = localcommitment;
    }
    public String gethoracommitment() {
        return horacommitment;
    }
    public void sethoracommitment(String horacommitment) {
        this.horacommitment = horacommitment;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Agenda other = (Agenda) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    
    
}
