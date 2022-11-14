package com.assessment.services;

import com.assessment.controller.form.PatientForm;
import com.assessment.model.Appointment;
import com.assessment.model.Patient;

import java.util.List;

public interface IHospitalService {
    public String makeAppointment(PatientForm form);
    public List<Patient> viewPatient();
    public List<Appointment> viewAppointment();
    public List<Appointment> viewAppointmentByName(String name);
    public Patient updatePatient(long patientid, Patient patient);
    public Appointment updateAppointment(long appointmentid, Appointment appointment);
    public void deletePatient(long patientid);
    public void deleteAppointment(long appointmentid);
}
