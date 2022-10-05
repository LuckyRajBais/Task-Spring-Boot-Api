package com.trips.data.services;

import com.trips.data.entities.Response;

public interface DriverServices {

	Response fetchAllData();

	Response getCityTripCount(String city);

	Response getDriverNameTripCount(String driverId);

}
