package com.vehicles.manufacturer.model;
import java.util.ArrayList;
import java.util.HashSet;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * 
 * @author 
 *using this Model class, spring can map the json to java object.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class VehiclesManufacturer {

	@JsonProperty("Count")
	private int count;
	
	@JsonProperty("Message")
	private String message;
	
	@JsonProperty("SearchCriteria")
	private String searchCriteria;
	
	@JsonProperty("Results")
	private ArrayList<Results> results;
	
	public VehiclesManufacturer() {
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




	public ArrayList<Results> getResults() {
		return results;
	}




	public void setResults(ArrayList<Results> results) {
		this.results = results;
	}




	@Override
    public String toString() {
        return "VehiclesManufacturer{" +
                "Count=" + count +
                "Message=" + message +
                "SearchCriteria=" + searchCriteria +
                '}';
    }


}
