package com.tuvch.hogarexperto.repository;

import com.tuvch.hogarexperto.entity.PatientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface PatientRepository extends CrudRepository <PatientEntity, Integer> {
    PatientEntity findByBirthday(Date birthday);
    PatientEntity findByNameAndLastName (String name, String lastName);
    PatientEntity findByNameAndLastNameAndMiddleName(String name, String lastName, String motherLastName);
}
