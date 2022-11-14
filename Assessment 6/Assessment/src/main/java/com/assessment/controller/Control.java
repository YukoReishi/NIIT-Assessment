package com.assessment.controller;

import com.assessment.controller.form.PatientForm;
import com.assessment.model.Appointment;
import com.assessment.model.Patient;
import com.assessment.services.HospitalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospital")
public class Control {

    @Autowired
    private HospitalServiceImpl service;

    @PostMapping("/addpatient")
    public String addPatient(@RequestBody PatientForm form){
        service.makeAppointment(form);
        return "Patient Added";
    }

    @GetMapping("/viewpatient")
    public List<Patient> viewPatient(){
        return service.viewPatient();
    }

    @GetMapping("viewappointment")
    public List<Appointment> viewAppointment(){
        return service.viewAppointment();
    }

    @GetMapping("viewappointmentbyname/{name}")
    public List<Appointment> viewAppointmentByName(@PathVariable("name") String name){
        return service.viewAppointmentByName(name);
    }

    @PutMapping("/updatepatient/{id}")
    public Patient updatePatient(@PathVariable("id") long id, @RequestBody Patient model){
        return service.updatePatient(id, model);
    }

    @PutMapping("/updateappointment/{id}")
    public Appointment updateAppointment(@PathVariable("id") long id, @RequestBody Appointment model){
        return service.updateAppointment(id, model);
    }

    @DeleteMapping("/deletepatient/{id}")
    public void deletePatient(@PathVariable("id") long id){
        service.deletePatient(id);
    }

    @DeleteMapping("/deleteappointment/{id}")
    public void deleteAppointment(@PathVariable("id") long id){
        service.deleteAppointment(id);
    }
}
