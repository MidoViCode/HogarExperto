package com.tuvch.hogarexperto.repository;

import com.tuvch.hogarexperto.entity.MedicalRecordEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalRecordRepository extends CrudRepository <MedicalRecordEntity, Integer> {
}
