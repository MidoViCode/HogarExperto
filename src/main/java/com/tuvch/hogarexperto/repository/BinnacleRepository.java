package com.tuvch.hogarexperto.repository;

import com.tuvch.hogarexperto.entity.BinnacleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BinnacleRepository extends CrudRepository<BinnacleEntity, Integer> {
    <PatientEntity> Optional<BinnacleEntity> findByPatientId(int idPatient, PatientEntity name);

}
