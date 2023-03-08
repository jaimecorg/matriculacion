package com.jaimecorg.matriculacion.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

@Entity
public class Asignatura {
    
    @Id
    private int id;

    private String descripcion;

    @ManyToMany(mappedBy = "asignaturas")
    private List<Alumno> alumnos;

    @Transient
    private boolean tieneAsignatura;

    public Asignatura(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Asignatura() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public List<Alumno> getAlumnos() {
        return alumnos;
    }
    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    public boolean isTieneAsignatura() {
        return tieneAsignatura;
    }
    public void setTieneAsignatura(boolean tieneAsignatura) {
        this.tieneAsignatura = tieneAsignatura;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
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
        Asignatura other = (Asignatura) obj;
        if (id != other.id)
            return false;
        return true;
    }    
}
