package com.vehicles.manufacturer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * 
 * @author 
 *using this Model class, spring can map the json to java object.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class VehicleDet {
	@JsonProperty("MakeId")
	private int makeId;
	
	@JsonProperty("MakeName")
	private String makeName;
	
	@JsonProperty("VehicleTypeId")
	private String vehicleTypeId;
	
	@JsonProperty("VehicleTypeName")
	private String vehicleTypeName;
	
	public VehicleDet() {
	}

	public int getMakeId() {
		return makeId;
	}

	public void setMakeId(int makeId) {
		this.makeId = makeId;
	}

	public String getMakeName() {
		return makeName;
	}

	public void setMakeName(String makeName) {
		this.makeName = makeName;
	}

	public String getVehicleTypeId() {
		return vehicleTypeId;
	}

	public void setVehicleTypeId(String vehicleTypeId) {
		this.vehicleTypeId = vehicleTypeId;
	}

	public String getVehicleTypeName() {
		return vehicleTypeName;
	}

	public void setVehicleTypeName(String vehicleTypeName) {
		this.vehicleTypeName = vehicleTypeName;
	}

	

	
	
    

}
