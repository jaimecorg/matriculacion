package com.jaimecorg.matriculacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaimecorg.matriculacion.models.Asignatura;

@Repository
public interface AsignaturaRepository extends  JpaRepository<Asignatura, Integer> {
    
}
