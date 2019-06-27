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
public class Results {
		
		@JsonProperty("Country")
		private String country;
		
		@JsonProperty("Mfr_CommonName")
		private String mfrCommonName;
		
		@JsonProperty("Mfr_ID")
		private String mfrId;
		
		@JsonProperty("Mfr_Name")
		private String mfrName;
		
		@JsonProperty("VehicleTypes")
		private ArrayList<VehicleTypes> vehicleTypes;
		
		public Results() {
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getMfrCommonName() {
			return mfrCommonName;
		}

		public void setMfrCommonName(String mfrCommonName) {
			this.mfrCommonName = mfrCommonName;
		}

		public String getMfrId() {
			return mfrId;
		}

		public void setMfrId(String mfrId) {
			this.mfrId = mfrId;
		}

		public String getMfrName() {
			return mfrName;
		}

		public void setMfrName(String mfrName) {
			this.mfrName = mfrName;
		}

		public ArrayList<VehicleTypes> getVehicleTypes() {
			return vehicleTypes;
		}

		public void setVehicleTypes(ArrayList<VehicleTypes> vehicleTypes) {
			this.vehicleTypes = vehicleTypes;
		}
		
		


	}
