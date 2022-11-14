package com.assessment.controller.form;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PatientForm {
    private long patientid;
    private String patientname;
    private String patientage;
    private String gender;
    private String guardianname;
    private String contactno;
    private String address;
}
