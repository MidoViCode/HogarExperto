package com.tuvch.hogarexperto.service.impl;

import com.tuvch.hogarexperto.dto.request.PatientRequest;
import com.tuvch.hogarexperto.dto.request.PersonalData;
import com.tuvch.hogarexperto.dto.response.PatientResponse;
import com.tuvch.hogarexperto.dto.response.Status;
import com.tuvch.hogarexperto.dto.response.StatusResponse;
import com.tuvch.hogarexperto.entity.BinnacleEntity;
import com.tuvch.hogarexperto.entity.PatientEntity;
import com.tuvch.hogarexperto.repository.PatientRepository;
import com.tuvch.hogarexperto.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public PatientResponse findPatient(int patientId) {
         PatientEntity patientEntity = patientRepository.findByPatientId(patientId);
    //    BinnacleEntity binnacleEntity= new BinnacleEntity();
    //    binnacleEntity.getPatientId();
         if(patientEntity == null){
            return new PatientResponse();
         } else{
             PersonalData personalData = new PersonalData();
             personalData.setName(patientEntity.getName());
             personalData.setLastname(patientEntity.getLastName());


             return PatientResponse.builder()
                     .blood(patientEntity.getBlood())
                     .info(patientEntity.getInfo())
                     .personalData(personalData)
                     .build();
         }
    }

    @Override
    public StatusResponse createPatient(PatientRequest patientRequest) {
        PatientEntity pEntity = new PatientEntity();
      //  pEntity.setPatientId(null);
        pEntity.setName(patientRequest.getPersonalData().getName());
        pEntity.setLastName(patientRequest.getPersonalData().getLastname());
        pEntity.setMiddleName(patientRequest.getPersonalData().getMotherLastName());
        pEntity.setAdress(patientRequest.getPersonalData().getAdress());

        pEntity.setPhone(patientRequest.getPersonalData().getPhone());

        pEntity.setGender(patientRequest.getPersonalData().getGenre());


        pEntity.setBlood(patientRequest.getBlood());

        pEntity.setBirthday(new Date());


        PatientEntity patientEntity = patientRepository.save(pEntity);

        if(patientEntity == null){
            return StatusResponse.builder()
                    .status(Status.ERROR)
                    .build();
        } else{
            return StatusResponse.builder()
                    .status(Status.OK)
                    .build();
        }
    }

    @Override
    public StatusResponse deletePatient(PatientRequest patientRequest) {
        return null;
    }

    @Override
    public StatusResponse updatePatient(PatientRequest patientRequest) {
        return null;
    }
}
