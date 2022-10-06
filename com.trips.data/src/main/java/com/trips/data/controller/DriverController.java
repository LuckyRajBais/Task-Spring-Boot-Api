package com.trips.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trips.data.entities.Driver;
import com.trips.data.entities.Response;
import com.trips.data.services.DriverServices;

@RestController
public class DriverController {

	@Autowired
	DriverServices driverServices;

	@GetMapping("/driver/")
	public Response fetchAllData() {
		return driverServices.fetchAllData();

	}

	@GetMapping("/driver/{city}")
	public Response getCityTripCount(@PathVariable String city) {
		return driverServices.getCityTripCount(city);
	}

	@GetMapping("/driver/driverId/{driverId}")
	public Response getDriverNameTripCount(@PathVariable String driverId) {
		return driverServices.getDriverNameTripCount(driverId);
	}

	@PostMapping("/driver/duration")
	public Response getTripByDurationdAndCity(@RequestBody Driver driver) {
		System.out.println(driver.getCity());
		return driverServices.getTripByDurationAndCity(driver.getCity(), driver.getStartTime(), driver.getEndTime());

	}

}
