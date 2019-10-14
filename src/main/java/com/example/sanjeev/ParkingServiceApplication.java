package com.example.sanjeev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.sanjeev.repo.ParkingRecordRepository;

@SpringBootApplication
public class ParkingServiceApplication {

	private static final Logger log = LoggerFactory.getLogger(ParkingServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ParkingServiceApplication.class);
	}


}
