package com.tuvch.hogarexperto.repository;

import com.tuvch.hogarexperto.entity.BinnacleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface BinnacleRepository extends CrudRepository<BinnacleEntity, Integer> {
    List<BinnacleEntity> findAllByPatientIdAndDateEquals(int idPatient, Date date);
    List<BinnacleEntity> findAllByPatientIdAndDateAfterAndDateBefore(int idPatient, Date after, Date before);
}
