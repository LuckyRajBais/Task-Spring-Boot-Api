package com.trips.data.services;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.trips.data.entities.Driver;
import com.trips.data.entities.Response;

@Service
public class DriverServicesImpl implements DriverServices {

	public List<Driver> readJsonData() {
		List<Driver> driver = new ArrayList<>();
		try {
			String json = Files.readString(Path
					.of("/home/vvdn/Documents/workspace-spring-tool-suite-4-4.15.3.RELEASE/com.trips.data/Trip.json"));
			driver = new Gson().fromJson(json, new TypeToken<List<Driver>>() {
			}.getType());

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(driver);
		return driver;
	}

	@Override
	public Response fetchAllData() {
		Response response = new Response();
		List<Driver> driverData = readJsonData();
		System.out.println(driverData);
		// response.setData(driverData);

		return response;
	}

	@Override
	public Response getCityTripCount(String city) {
		Response response = new Response();
		List<Driver> driverData = readJsonData();
		int count = 0;
		for (Driver driver : driverData) {
			if (driver.getCity().equals(city)) {
				count++;
			}
			response.setCount(count);
			System.out.println(city + " count " + count);
		}

		return response;

	}

	@Override
	public Response getDriverNameTripCount(String driverId) {
		Response response = new Response();
		List<Driver> driverData = readJsonData();
		Integer count = 0;
		for (Driver driver : driverData) {
			if (driver.getDriverId().equals(driverId)) {
				count++;
			}
			response.setCount(count);
			System.out.println(driverId + " count " + count);
		}
		return response;

	}

}
