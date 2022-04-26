package com.example.rahul.rest_app_with_database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rahul.rest_app_with_database.model.Patient;
import com.example.rahul.rest_app_with_database.repo.PatientRepo;

@Service
public class PatientServiceImplementation implements PatientService {
   @Autowired
	private PatientRepo patientRepo;
	@Override
	public Patient addPatient(Patient patient) {
		
		return patientRepo.save(patient);
	}
	@Override
	public List<Patient> findAllPatient() {
		return patientRepo.findAll();
	}
	@Override
	public Patient findPatientById(int id) {
		
		return patientRepo.findById(id).get();
	}
	@Override
	public String deletePatientById(Integer id) {
		patientRepo.deleteById(id);
		return "deleted succesfuly";
	}

}
