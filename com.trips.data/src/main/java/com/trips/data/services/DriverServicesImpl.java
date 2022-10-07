package com.trips.data.services;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
	public Map<String, Integer> fetchTripdetail() {
		List<Driver> driverData = readJsonData();
		Set<String> city = new HashSet<>();
		for (Driver driver : driverData) {
			city.add(driver.getCity());
		}
		Map<String, Integer> map = new HashMap<>();
		for (String c : city) {
			Integer count = 0;
			for (Driver driver : driverData) {
				if (driver.getCity().endsWith(c)) {
					count++;
					System.out.println("count :" + count);
				}

			}
			map.put(c, count);
			System.out.println(map);

		}
		return map;
	}

	@Override
	public List<Map> fetchDriverDetail() {

		List<Driver> driverData = readJsonData();
		Set<String> driverName = new HashSet<>();
		Set<String> driverId = new HashSet<>();
		List<Map> list = new ArrayList<>();
		for (Driver driver : driverData) {
			driverName.add(driver.getDriverFullName());
		}

		for (Driver dri : driverData) {
			driverId.add(dri.getDriverId());
		}
		System.out.println(driverName);
		System.out.println(driverId);
		Integer count = 0;

		// Map<String, Object> name = new HashMap<>();
		for (String id : driverId) {

			for (String dname : driverName) {
				Map<String, Object> map = new HashMap<>();

				for (Driver dri : driverData) {

					if (id.equals(dri.getDriverId()) && dname.equals(dri.getDriverFullName())) {
						map.put("DriverId", id);
						map.put("DriverName", dname);
						if (id.equals(count)) {
							System.out.println(id.equals(id));
						}

						count += 1;
						map.put("TripsCount", count);
						list.add(map);
					}
					count = 0;
				}
			}
		}
		return list;
	}

	@Override
	public Map<String, Object> getTripByDurationAndCity(Driver driver) {
		List<Driver> driverData = readJsonData();
		System.out.println(driver);
		Map<String, Object> response = new HashMap<String, Object>();
		List<Object> list = new ArrayList<>();
		System.out.println(driver.getCity());
		for (Driver driver1 : driverData) {

			System.out.println(driver1.getCity());
			if (driver1.getStartTime().equals(driver.getStartTime()) && driver.getEndTime() == driver.getEndTime()
					&& driver.getCity().equals(driver.getCity())) {
				list.add(driver1);
				System.out.println(list);
			}
			response.put("TripsByStartEnd", list);
		}
		return response;
	}

}