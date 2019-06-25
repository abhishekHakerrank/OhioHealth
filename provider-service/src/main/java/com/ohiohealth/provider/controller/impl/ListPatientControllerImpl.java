/**
 * 
 */
package com.ohiohealth.provider.controller.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.ohiohealth.provider.controller.ListPatientController;
import com.ohiohealth.provider.controller.model.ListPatientReq;
import com.ohiohealth.provider.controller.model.ListPatientRes;
import com.ohiohealth.provider.controller.model.Patient;
import com.ohiohealth.provider.controller.model.PatientID;



/**
 * @author photonuser
 *
 */
@Component
public class ListPatientControllerImpl implements ListPatientController {
	
	private final String endpoint = "http://vulpix-dev:85/api/epic/2017/Clinical/ManagedAccess/GetPatientList?UserID={userID}&UserIDType={userIDType}&MaximumPatients={maximumPatients}&NextIncrementalLoad={nextIncrementalLoad}&SexType={sexType}&SexReturnType={sexReturnType}";

	@Override
	public ListPatientRes listPatients(ListPatientReq listMyPatientsReq) {
		final HttpHeaders headers = new HttpHeaders();
        headers.set("Epic-Client-ID", "2a4a7c7f-19c6-4ca0-b605-5934b8a25d48");
        headers.set("Authorization", "Basic ZW1wJE1PQklMRUlOVDo1REtKdEtnZC9sblRFeA==");
        headers.set("Content-Type", "application/json");
        headers.set("X-API-key", "a2f39057-08a7-40f2-a855-ae94e72fd3d7");

        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(endpoint)
                .queryParam("userID", "120964")
                .queryParam("userIDType", "CID")
                .queryParam("maximumPatients", "1")
                .queryParam("nextIncrementalLoad", "1")
                .queryParam("sexType", "Male")
                .queryParam("sexReturnType", "1");
        
        //Create a new HttpEntity
        final HttpEntity<String> entity = new HttpEntity<String>(headers);
        RestTemplate restTemplate = new RestTemplate();
        //Execute the method writing your HttpEntity to the request
        ResponseEntity<ListPatientRes> response = restTemplate.exchange(uriBuilder.toUriString(), HttpMethod.GET, entity, ListPatientRes.class);        
        System.out.println(response.getBody());
		return response.getBody();
		//return ListPatientControllerImpl.mockEpicResponse();
	}

	private static ListPatientRes mockEpicResponse() {
		List<Patient> patients = new ArrayList<>();
		List<PatientID> johnPatientIds = new ArrayList<>() ;
		johnPatientIds.add(new PatientID("ADE-841-0801", "CEID"));
		johnPatientIds.add(new PatientID("151766", "EXTERNAL"));
		Patient john = new Patient("John", "23", "Male", johnPatientIds);
		patients.add(john);
		
		List<PatientID> thomasPatientIds = new ArrayList<>() ;
		thomasPatientIds.add(new PatientID("AD1-150-5222", "CEID"));
		thomasPatientIds.add(new PatientID("276042", "EPI"));
		Patient thomas = new Patient("Thomas", "28", "Male", thomasPatientIds);
		patients.add(thomas);
		
		return new ListPatientRes(patients, false, "PGP-101-Z402315", true, null);

	}

}
