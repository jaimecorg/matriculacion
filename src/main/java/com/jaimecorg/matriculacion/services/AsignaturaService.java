package com.jaimecorg.matriculacion.services;

import java.util.List;

import com.jaimecorg.matriculacion.models.Asignatura;

public interface AsignaturaService {
    
    public List<Asignatura> findAll();
    public Asignatura findById(int id);
    public Asignatura save(Asignatura asignatura);
    public void update(int id, Asignatura asignatura);
    public void deleteById(int id);
    public void deleteAll();
}
