package com.tuvch.hogarexperto.service;

import com.tuvch.hogarexperto.dto.request.PatientRequest;
import com.tuvch.hogarexperto.dto.response.PatientResponse;
import com.tuvch.hogarexperto.dto.response.StatusResponse;

public interface PatientService {
    PatientResponse findPatient(int patientId);
    StatusResponse createPatient(PatientRequest patientRequest);
    StatusResponse deletePatient(PatientRequest patientRequest);
    StatusResponse updatePatient(PatientRequest patientRequest);
}
