package com.example.rahul.rest_app_with_database.service;

import com.example.rahul.rest_app_with_database.model.Patient;

public interface PatientService {

	Patient addPatient(Patient patient);

	java.util.List<Patient> findAllPatient();

	Patient findPatientById(int id);

	String deletePatientById(Integer id);
  
}
