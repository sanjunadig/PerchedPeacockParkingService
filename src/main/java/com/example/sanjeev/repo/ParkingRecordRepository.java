package com.example.sanjeev.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.sanjeev.model.ParkingRecord;

public interface ParkingRecordRepository extends CrudRepository<ParkingRecord, Long> {

    List<ParkingRecord> findByVehicleNumber(String vehicleNumber);

	ParkingRecord findById(long id);
}
