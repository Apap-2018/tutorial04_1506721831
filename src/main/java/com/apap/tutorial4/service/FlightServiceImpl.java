package com.apap.tutorial4.service;
import com.apap.tutorial4.model.FlightModel;
import com.apap.tutorial4.repository.FlightDB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class FlightServiceImpl implements FlightService {
	@Autowired
	private FlightDB flightDb;
	
	@Override
	public void addFlight(FlightModel flight) {
		flightDb.save(flight);		
	}
	
    @Override
    public void deleteFlight(long id) {
        flightDb.deleteById(id);
    }
    
	@Override
	public List<FlightModel> viewAll() {
		return flightDb.findAll();
	}
	
}
