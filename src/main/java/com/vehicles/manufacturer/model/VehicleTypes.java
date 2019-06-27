package com.vehicles.manufacturer.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * 
 * @author 
 *using this Model class, spring can map the json to java object.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class VehicleTypes {
		@JsonProperty("IsPrimary")
		private boolean isPrimary;
		
		@JsonProperty("Name")
		private String name;

		
		public VehicleTypes() {
			// TODO Auto-generated constructor stub
		}
		

		public boolean isPrimary() {
			return isPrimary;
		}


		public void setPrimary(boolean isPrimary) {
			this.isPrimary = isPrimary;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}



	}

