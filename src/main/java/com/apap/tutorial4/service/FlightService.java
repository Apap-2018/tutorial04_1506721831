package com.apap.tutorial4.service;

import java.util.List;

import com.apap.tutorial4.model.FlightModel;

public interface FlightService {
	void addFlight(FlightModel flight);
	void deleteFlight(long id);
	List<FlightModel> viewAll();
}
