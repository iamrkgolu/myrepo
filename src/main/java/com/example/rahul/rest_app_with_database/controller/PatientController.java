package com.example.rahul.rest_app_with_database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rahul.rest_app_with_database.model.Patient;
import com.example.rahul.rest_app_with_database.service.PatientService;

@RestController
@CrossOrigin
public class PatientController {
	@Autowired
	private PatientService patientService;

	@PostMapping("/addPatient")
	public Patient addPatient(@RequestBody Patient patient) {
		return patientService.addPatient(patient);
	}

	@GetMapping("/findPatient")
	public List<Patient> findAllPatient() {
		return patientService.findAllPatient();
	}

	@GetMapping("/findPatient/{id}")
	public Patient findPatientById(@PathVariable("id") Integer id) {
		return patientService.findPatientById(id);
	}
	@DeleteMapping("/delete/{id}")
	public String deletePatientById(@PathVariable("id") Integer id) {
		return patientService.deletePatientById(id);
	}

}
