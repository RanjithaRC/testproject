package com.project.Hms.service;

import java.util.List;

import com.project.Hms.model.Doctor;
import com.project.Hms.model.Patient;


public interface PatientService {

	List<Patient> getAllPatients();
	
	Patient savePatient(Patient patient);
	
	Patient getPatientById(Long id);
	
	Patient updatePatient(Patient patient);
	
	void deletePatientById(Long id);

	//Doctor saveDoctor(Doctor doctor);
	

}
