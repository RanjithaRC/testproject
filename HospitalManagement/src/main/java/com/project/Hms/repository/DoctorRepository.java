package com.project.Hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Hms.model.Doctor;

 
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
