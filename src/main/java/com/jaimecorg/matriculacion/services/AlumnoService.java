package com.jaimecorg.matriculacion.services;

import java.util.List;

import com.jaimecorg.matriculacion.models.Alumno;

public interface AlumnoService {
    
    public List<Alumno> findAll();
    public Alumno findById(int id);
    public Alumno save(Alumno alumno);
    public void update(int id, Alumno alumno);
    public void deleteById(int id);
    public void deleteAll();
}
