package com.vehicles.manufacturer;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vehicles.manufacturer.services.impl.VehicleManufacturerServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;

/**
 * 
 * @author M3bi
 * @SpringBootApplication: enable the configuration and do the component scan to instantiate the @component
 * beans and load into IOC container
 *
 */
@SpringBootApplication
public class SpringBootVehiclesManufacturer {
	private static final Logger log = LoggerFactory.getLogger(SpringBootVehiclesManufacturer.class);
	
	/**
	 * 
	 * @param args
	 * When we call the SpringApplication class run method, 
	 * spring will provide the configurable application context object which will find the @configure annotation
	 * and do the configuration and etc..
	 * 
	 */
	public static void main(String[] args) {
		log.info("main");
		try {
		SpringApplication.run(SpringBootVehiclesManufacturer.class, args);
		}catch(Exception e) {
			log.error(e.getMessage());
		}
	}

}
