package com.example.rahul.rest_app_with_database.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rahul.rest_app_with_database.model.Patient;
@Repository
public interface PatientRepo extends JpaRepository<Patient, Integer> {

}
