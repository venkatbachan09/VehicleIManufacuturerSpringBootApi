package com.vehicles.manufacturer.controller;

/**
 * for creating api we use below interfaces
 */
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * for handing provided request data, will use these interfaces and import here
 */
import org.springframework.web.bind.annotation.RequestParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * for dependency injection
 */
import org.springframework.beans.factory.annotation.Autowired;

/**
 * application related classes and interfaces import here
 */
import com.vehicles.manufacturer.services.VehicleManufacturerService;
import com.vehicles.manufacturer.SpringBootVehiclesManufacturer;
import com.vehicles.manufacturer.error.ErrorPayload;
import com.vehicles.manufacturer.model.Manufacturer;
import com.vehicles.manufacturer.model.VehiclesManufacturer;


/**
 * 
 * @author 
 * Whenever client trying access our api, a single Dispatcher servlet receives all requests and
 * transfer them to controller and components
 */
@RestController
@RequestMapping("/auto")
public class VehicleManufacturerController {
	private static final Logger log = LoggerFactory.getLogger(SpringBootVehiclesManufacturer.class);
	/**
	 * when spring do the component scan and load all beans to IOC then 
	 * using Autowired annotation, spring will inject the beans to the controller, services and repository
	 * 
	 */
	@Autowired
	private VehicleManufacturerService vehicleManufacturerService;
	
	/**
	 * 
	 * @return
	 * using Cross Origin, make interaction with application with in the same domain.
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	/**
	 * 
	 * @return
	 * using GetMapping annotation, we can enable the http GET method
	 * Using ResponseEntity, we can respond to the client, either success response or error response
	 */
	@GetMapping("/vehicles")
	public ResponseEntity<?> getAllVehiclesTypesByManufacturer() {
		log.info("getAllVehiclesTypesByManufacturer");
		try {
		VehiclesManufacturer vehiclesManufacturer = vehicleManufacturerService.getAllVehiclesByManufacturer();
		if(vehiclesManufacturer==null) {
			ErrorPayload err= new ErrorPayload();
			err.setErrCode("VMNOT11");
			err.setErrMessage("Vehicles not available");
			return new ResponseEntity<ErrorPayload>(err, HttpStatus.NOT_FOUND);
		} 
		
		return new ResponseEntity<VehiclesManufacturer>(vehiclesManufacturer, HttpStatus.OK);
		}catch(Exception e) {
			log.error(e.getMessage());
			ErrorPayload err= new ErrorPayload();
			err.setErrCode("5000");
			err.setErrMessage("Service not available");
			return new ResponseEntity<ErrorPayload>(err, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	/**
	 * 
	 * @return
	 * using GetMapping annotation, we can enable the http GET method
	 * Using ResponseEntity, we can respond to the client, either success response or error response
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/vehicles/{mafacturerName}")
	public ResponseEntity<?> getAllVehiclesTypesByManufacturerName(@PathVariable("mafacturerName") String mafacturerName) {
		log.info("getAllVehiclesTypesByManufacturerName");
		try {
		Manufacturer manufacturer = vehicleManufacturerService.getAllVehiclesByManufacturerName(mafacturerName);
		if(manufacturer==null) {
			ErrorPayload err= new ErrorPayload();
			err.setErrCode("VMNOT11");
			err.setErrMessage("Vehicles not available");
			return new ResponseEntity<ErrorPayload>(err, HttpStatus.NOT_FOUND);
		} 
		
		return new ResponseEntity<Manufacturer>(manufacturer, HttpStatus.OK);
	}catch(Exception e) {
		log.error(e.getMessage());
		ErrorPayload err= new ErrorPayload();
		err.setErrCode("5000");
		err.setErrMessage("Service not available");
		return new ResponseEntity<ErrorPayload>(err, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}

}
