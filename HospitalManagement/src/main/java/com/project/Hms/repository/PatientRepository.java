package com.project.Hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Hms.model.Doctor;
import com.project.Hms.model.Patient;


public interface PatientRepository extends JpaRepository< Patient, Long>{

	 

}
