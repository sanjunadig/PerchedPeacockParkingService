package com.example.sanjeev.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.sanjeev.model.ParkingRecord;

public interface ParkingRecordRepository extends CrudRepository<ParkingRecord, Long> {

	List<ParkingRecord> findAll();
	
    List<ParkingRecord> findByVehicleNo(String vehicleNo);

	ParkingRecord findById(long id);
}
