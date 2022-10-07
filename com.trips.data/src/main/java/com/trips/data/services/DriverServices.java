package com.trips.data.services;

import java.util.List;
import java.util.Map;

import com.trips.data.entities.Driver;
import com.trips.data.entities.Response;

public interface DriverServices {

	Response fetchAllData();

	public Map<String, Integer> fetchTripdetail();

	List<Map> fetchDriverDetail();

	public Map<String, Object> getTripByDurationAndCity(Driver driver);

}
