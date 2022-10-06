package com.trips.data.entities;

public class Driver {
	
	private String startTime;
	private String endTime;
	private String vehicleName;
	private String driverFirstName;
	private String driverLastName;
	private String driverFullName;
	private String tripId;
	private String deviceId;
	private String driverId;
	private String vehicleId;
	private int  distance;
	private int  duration;
	private int  maxStreetlimit;
	private int  maxSpeed;
	private String city;
	
	
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getDriverFirstName() {
		return driverFirstName;
	}
	public void setDriverFirstName(String driverFirstName) {
		this.driverFirstName = driverFirstName;
	}
	public String getDriverLastName() {
		return driverLastName;
	}
	public void setDriverLastName(String driverLastName) {
		this.driverLastName = driverLastName;
	}
	public String getDriverFullName() {
		return driverFullName;
	}
	public void setDriverFullName(String driverFullName) {
		this.driverFullName = driverFullName;
	}
	public String getTripId() {
		return tripId;
	}
	public void setTripId(String tripId) {
		this.tripId = tripId;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDriverId() {
		return driverId;
	}
	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}
	public String getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getMaxStreetlimit() {
		return maxStreetlimit;
	}
	public void setMaxStreetlimit(int maxStreetlimit) {
		this.maxStreetlimit = maxStreetlimit;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Driver(String startTime, String endTime, String vehicleName, String driverFirstName, String driverLastName,
			String driverFullName, String tripId, String deviceId, String driverId, String vehicleId, int distance,
			int duration, int maxStreetlimit, int maxSpeed, String city) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.vehicleName = vehicleName;
		this.driverFirstName = driverFirstName;
		this.driverLastName = driverLastName;
		this.driverFullName = driverFullName;
		this.tripId = tripId;
		this.deviceId = deviceId;
		this.driverId = driverId;
		this.vehicleId = vehicleId;
		this.distance = distance;
		this.duration = duration;
		this.maxStreetlimit = maxStreetlimit;
		this.maxSpeed = maxSpeed;
		this.city = city;
	}
	
	
	
	
	
	

}
