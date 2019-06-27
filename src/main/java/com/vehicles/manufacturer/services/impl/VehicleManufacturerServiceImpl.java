package com.vehicles.manufacturer.services.impl;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vehicles.manufacturer.model.Manufacturer;
import com.vehicles.manufacturer.model.VehiclesManufacturer;
import com.vehicles.manufacturer.services.VehicleManufacturerService;
/**
 * 
 * @author 
 *using this service impl, our api can call the DAO layer or any external apis as well.
 *@Service annotation is singleton as like @Restcontroller and @Repository
 */
@Service
public class VehicleManufacturerServiceImpl implements VehicleManufacturerService{
	/**
	 * using Logger class, api can maintain required logs.
	 */
	private static final Logger log = LoggerFactory.getLogger(VehicleManufacturerServiceImpl.class);
	/**
	 * Api can interact with external api using Resttemplate
	 */
	public VehiclesManufacturer getAllVehiclesByManufacturer() {
		log.info("getAllVehiclesByManufacturer");
		
		VehiclesManufacturer vehiclesManufacturer =null;
		RestTemplate restTemplate = new RestTemplate();
		//Map result = restTemplate.getForObject("https://vpic.nhtsa.dot.gov/api/vehicles/getallmanufacturers?format=json", HashMap.class);
		try {
		vehiclesManufacturer = restTemplate.getForObject("https://vpic.nhtsa.dot.gov/api/vehicles/getallmanufacturers?format=json", VehiclesManufacturer.class);
		System.out.println(vehiclesManufacturer.toString());
		}catch(Exception e) {
			log.error(e.getMessage());
		}
		
		return vehiclesManufacturer;
	}
	/**
	 * Api can interact with external api using Resttemplate
	 */
	public Manufacturer getAllVehiclesByManufacturerName(String mafacturerName) {
		log.info("getAllVehiclesByManufacturerName");
		Manufacturer manufacturer =null;
		RestTemplate restTemplate = new RestTemplate();
		try {
			manufacturer = restTemplate.getForObject("https://vpic.nhtsa.dot.gov/api/vehicles/GetVehicleTypesForMake/"+mafacturerName+"?format=json", Manufacturer.class);
		}catch(Exception e) {
			log.error(e.getLocalizedMessage());
		}
		return manufacturer;
	}
	
	

}
