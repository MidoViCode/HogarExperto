package com.tuvch.hogarexperto.repository;

import com.tuvch.hogarexperto.entity.MedicineEntity;
import com.tuvch.hogarexperto.entity.RelativeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface MedicineRepository extends CrudRepository<MedicineEntity, Integer> {
    MedicineEntity findByMedicineId(Integer medicineId);
    MedicineEntity findByExpiryDate(Date expiryDate);
}
