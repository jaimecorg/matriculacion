package com.jaimecorg.matriculacion.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Alumno {
    @Id
    @GeneratedValue
    private int id;
    
    private String nombre;
    private String apellidos;
    private String email;
    private Date fecha_nacimiento;
    private int telefono;
    
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Asignatura> asignaturas;
    
    public Alumno(int codigo) {
        this.id = codigo;
    }

    public Alumno(int id, String nombre, String apellidos, String email, Date fechaNacimiento, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.fecha_nacimiento = fechaNacimiento;
        this.telefono = telefono;
    }

    public Alumno() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }
    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
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
        Alumno other = (Alumno) obj;
        if (id != other.id)
            return false;
        return true;
    }

    
}
