package com.tuvch.hogarexperto.repository;

import com.tuvch.hogarexperto.entity.MedicalRecordEntity;
import com.tuvch.hogarexperto.entity.PatientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface MedicalRecordRepository extends CrudRepository <MedicalRecordEntity, Integer> {
    PatientEntity findByBirthday(String birthday);
    PatientEntity findByNameAndLastName (String name, String lastName);
    PatientEntity findByNameAndLastNameaAndMotherLastName(String name, String lastName, String motherLastName);
    MedicalRecordEntity findByAdmissionDate(Date admissionDate);
}
