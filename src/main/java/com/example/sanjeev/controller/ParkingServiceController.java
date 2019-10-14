package com.example.sanjeev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.sanjeev.model.ParkingRecord;
import com.example.sanjeev.service.ParkingManagementService;

@RestController
@RequestMapping("api/v1/parking")
public class ParkingServiceController {

	@Autowired
	private ParkingManagementService service;
	
	@RequestMapping(path="slots/available", method = RequestMethod.GET)
	public ResponseEntity<List<ParkingRecord>> findParkingSpaceAvailable(){
		return ResponseEntity.ok(service.getParkingSpaceAvailable());
	}
}
