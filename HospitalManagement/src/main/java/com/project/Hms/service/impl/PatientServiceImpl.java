package com.project.Hms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.Hms.model.Doctor;
import com.project.Hms.model.Patient;
import com.project.Hms.repository.DoctorRepository;
import com.project.Hms.repository.PatientRepository;
import com.project.Hms.service.PatientService;

@Service
public  class PatientServiceImpl implements PatientService {

	private PatientRepository patientrepo;

	public PatientServiceImpl(PatientRepository patientrepo) {
		super();
		this.patientrepo = patientrepo;
	}

	@Override
	public List<Patient> getAllPatients() {
		// TODO Auto-generated method stub
		return patientrepo.findAll();
	}

	@Override
	public Patient savePatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientrepo.save(patient);
	}

	@Override
	public Patient getPatientById(Long id) {
		// TODO Auto-generated method stub
		return patientrepo.findById(id).get();
	}

	@Override
	public Patient updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientrepo.save(patient);
	}

	@Override
	public void deletePatientById(Long id) {
		// TODO Auto-generated method stub
		patientrepo.deleteById(id);
	}
	
	
//    private DoctorRepository doctorrepo;
//    
//	@Override
//	public Doctor saveDoctor(Doctor doctor) {
//		// TODO Auto-generated method stub
//		return doctorrepo.save(doctor);
//	}

	
	
	
}
