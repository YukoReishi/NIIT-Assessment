package com.assessment.services;

import com.assessment.controller.form.PatientForm;
import com.assessment.model.Appointment;
import com.assessment.model.Patient;
import com.assessment.repository.AppointmentRepository;
import com.assessment.repository.PatientRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService{

    @Autowired
    private PatientRepository prepo;

    @Autowired
    private AppointmentRepository arepo;

//    Using Patient Form creating the Patient Database and using Patient making an Appointment
    public String makeAppointment(PatientForm form){

        Patient patient = new ObjectMapper().convertValue(form, Patient.class);
        prepo.save(patient);
//        String name = patient.getPatientname();
//        String age = patient.getPatientage();
//        String gender = patient.getGender();

        Appointment appointment = new Appointment(
                patient.getPatientname(),
                patient.getPatientage(),
                patient.getGender(),
                "Harsh Verma",
                "1000"
        );
        arepo.save(appointment);
        String appointmentnumber = String.valueOf(appointment.getAppointmentid());
        return "Appointment Made with the Appointment ID: " + appointmentnumber;
    }

//    Viewing the Patient
    public List<Patient> viewPatient(){
        return prepo.findAll();
    }

//    Viewing the Appointment
    public List<Appointment> viewAppointment(){
        return arepo.findAll();
    }

    public List<Appointment> viewAppointmentByName(String name){
        return arepo.findByPatientname(name);
    }

//    Updating the Patient
    public Patient updatePatient(long patientid, Patient patient){
        return prepo.save(patient);
    }

//    Updating the Appointment
    public Appointment updateAppointment(long appointmentid, Appointment appointment){
        return arepo.save(appointment);
    }

//    Deleting the Patient
    public void deletePatient(long patientid){
        prepo.deleteById(patientid);
    }

//    Deleting the Appointment
    public void deleteAppointment(long appointmentid){
        arepo.deleteById(appointmentid);
    }
}
