package com.ohiohealth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ohiohealth.response.Patient;

@Service
public class PatientDataService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	public String getPatientDatabyId(String patientId) {
		
		
		return restTemplate.getForObject("https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Patient/"+patientId, String.class);
		
	}

}
