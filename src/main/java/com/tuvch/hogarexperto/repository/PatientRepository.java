package com.tuvch.hogarexperto.repository;

import com.tuvch.hogarexperto.entity.PatientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends CrudRepository <PatientEntity, Integer> {
}
