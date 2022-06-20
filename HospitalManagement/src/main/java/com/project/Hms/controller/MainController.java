package com.project.Hms.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;

import com.project.Hms.model.Doctor;
import com.project.Hms.model.Patient;
import com.project.Hms.service.PatientService;

@Controller
public class MainController {

	private PatientService patientService;

	public MainController(PatientService patientService) {
		super();
		this.patientService = patientService;
	}
	
	@GetMapping("/patients")
	public String listPatients(Model model) {
		model.addAttribute( "patients", patientService.getAllPatients());
		return  "patients";
	}
	
	@GetMapping("/patients/new")
	public String createPatientForm(Model model) {
		
		Patient patient = new Patient();
		model.addAttribute("patient",patient );
		return "create_patient";
		}
	
	@PostMapping("/patients")
	public String savePatient(@ModelAttribute("patient") Patient patient) {
		patientService.savePatient(patient);
		return "redirect:/patients";
		
	}
	
//	@GetMapping("/patients/doc")
//	public String createDoctorForm(Model model) {
//		
//		Doctor doctor = new Doctor();
//		model.addAttribute("Doctor",doctor);
//		return "create_doctor";
//		}
//	
//	@PostMapping("/patients")
//	public String saveDoctor(@ModelAttribute("doctor") Doctor doctor) {
//		patientService.saveDoctor(doctor);
//		return "redirect:/patients";
//		
//	}
	
	@GetMapping("/patients/edit/{id}")
	public String editPatientForm(@PathVariable Long id,Model model) {
		model.addAttribute( "patient",patientService.getPatientById(id));
		return "edit_patient";
		
	}
	
	@PostMapping("/patients/{id}")
	public String updatePatient(@PathVariable Long id,@ModelAttribute("patient") Patient patient,Model model) {
		
		Patient existingPatient = patientService.getPatientById(id);
		existingPatient.setId(id);
		existingPatient.setName( patient.getName());
		existingPatient.setGender( patient.getGender());
		existingPatient.setDob( patient.getDob());
		existingPatient.setAge( patient.getAge());
		existingPatient.setDoctor( patient.getDoctor());
		
		patientService.updatePatient(existingPatient);
		return "redirect:/patients";
	}
	
	
	
	@GetMapping("/patients/{id}")
	public String deleteStudent(@PathVariable Long id) {
		patientService.deletePatientById(id);
		return "redirect:/patients";
	}
	

	
}
