package com.jaimecorg.matriculacion.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaimecorg.matriculacion.models.Asignatura;
import com.jaimecorg.matriculacion.services.AsignaturaService;
import com.jaimecorg.matriculacion.repository.AsignaturaRepository;

@Service
public class AsignaturaServiceImpl implements AsignaturaService{

    @Autowired
    AsignaturaRepository repository;

    @Override
    public List<Asignatura> findAll() {
        return repository.findAll();
    }

    @Override
    public Asignatura findById(int id) {
        Optional<Asignatura> findById = repository.findById(id);
        if(findById != null){
            return findById.get();
        }
        return null;
    }

    @Override
    public Asignatura save(Asignatura asignatura) {
        return repository.save(asignatura);

    }

    @Override
    public void update(int id, Asignatura asignatura) {
        this.findById(id);
        asignatura.setId(id);
        repository.save(asignatura);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }

    

    
}
