package com.assessment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long appointmentid;
    private String patientname;
    private String patientage;
    private String gender;
    private String doctorname;
    private String fees;

    public Appointment() {
    }

    public Appointment(String patientname, String patientage, String gender, String doctorname, String fees) {
        this.appointmentid = appointmentid;
        this.patientname = patientname;
        this.patientage = patientage;
        this.gender = gender;
        this.doctorname = doctorname;
        this.fees = fees;
    }

    public long getAppointmentid() {
        return appointmentid;
    }

    public void setAppointmentid(long appointmentid) {
        this.appointmentid = appointmentid;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public String getPatientage() {
        return patientage;
    }

    public void setPatientage(String patientage) {
        this.patientage = patientage;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }
}
