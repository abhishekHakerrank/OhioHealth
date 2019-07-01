package com.ohiohealth.provider.resource.model;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;

public class Patients_bkup implements Serializable{

		private static final long serialVersionUID = -4775768731641746374L;
		
		@ApiModelProperty(notes = "The name of the patient, including the preferred name in quotes", value="patientName")
		private List <Patient> patients;

		public Patients_bkup() {
			
		}
		

		public Patients_bkup(List<Patient> patients) {
			super();
			this.patients = patients;
		}
		
		
		public List<Patient> getPatients() {
			return patients;
		}

		public void setPatients(List<Patient> patients) {
			this.patients = patients;
		}

		
		
}
