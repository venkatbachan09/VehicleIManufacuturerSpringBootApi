package com.vehicles.manufacturer.services;

import com.vehicles.manufacturer.model.Manufacturer;
import com.vehicles.manufacturer.model.VehiclesManufacturer;
/**
 * 
 * @author 
 *Using this interface, our application will be loosely coupled 
 */
public interface VehicleManufacturerService {
	
	public VehiclesManufacturer getAllVehiclesByManufacturer();

	public Manufacturer getAllVehiclesByManufacturerName(String mafacturerName);

	
}
