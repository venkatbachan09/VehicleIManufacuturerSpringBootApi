package com.vehicles.manufacturer.model;
import java.util.ArrayList;
import java.util.HashSet;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author 
 *using this Model class, spring can map the json to java object.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Manufacturer {

	@JsonProperty("Count")
	private int count;
	@JsonProperty("Message")
	private String message;
	@JsonProperty("SearchCriteria")
	private String searchCriteria;
	@JsonProperty("Results")
	private ArrayList<VehicleDet> vehicleDet;

	public Manufacturer() {
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSearchCriteria() {
		return searchCriteria;
	}

	public void setSearchCriteria(String searchCriteria) {
		this.searchCriteria = searchCriteria;
	}

	public ArrayList<VehicleDet> getVehicleDet() {
		return vehicleDet;
	}

	public void setVehicleDet(ArrayList<VehicleDet> vehicleDet) {
		this.vehicleDet = vehicleDet;
	}




}
