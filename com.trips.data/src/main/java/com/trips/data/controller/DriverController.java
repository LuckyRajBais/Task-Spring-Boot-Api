package com.trips.data.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

	@GetMapping("/Driver/tripdetail")
	public Map<String, Integer> fetchTripdetail() {
		return driverServices.fetchTripdetail();
	}

	@GetMapping("/driver/DriverDetail")
	public List<Map> fetchDriverDetail() {
		return driverServices.fetchDriverDetail();
	}

	@PostMapping("/driver/duration")
	public Map<String, Object> getTripByDurationdAndCity(@RequestBody Driver driver) {
		// System.out.println(driver.getCity());
		// return driverServices.getTripByDurationAndCity(driver.getCity(),
		// driver.getStartTime(), driver.getEndTime());
		return driverServices.getTripByDurationAndCity(driver);

	}
}
