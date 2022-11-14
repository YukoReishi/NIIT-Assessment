package com.assessment.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Patient {

    @Id
    private long patientid;
    private String patientname;
    private String patientage;
    private String gender;
    private String guardianname;
    private String contactno;
    private String address;
}
