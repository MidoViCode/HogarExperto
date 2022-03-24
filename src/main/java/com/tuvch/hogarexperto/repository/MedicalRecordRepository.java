package com.tuvch.hogarexperto.repository;

import com.tuvch.hogarexperto.entity.MedicalRecordEntity;
import com.tuvch.hogarexperto.entity.PatientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface MedicalRecordRepository extends CrudRepository <MedicalRecordEntity, Integer> {
    MedicalRecordEntity findByPatientEntityBirthday(Date birthday);
    MedicalRecordEntity findFirstByPatientEntityNameAndPatientEntityLastName (String name, String lastName);
    MedicalRecordEntity findByCurp(String curp);
    MedicalRecordEntity findByAdmissionDate(Date admissionDate);
}
