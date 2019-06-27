package com.vehicles.manufacturer.error;
/**
 * 
 * @author 
 *Using this object, api can provide the appropriate error message and api specific error code
 */
public class ErrorPayload {

	private String errCode;
	private String errMessage;
	
	public String getErrCode() {
		return errCode;
	}
	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	public String getErrMessage() {
		return errMessage;
	}
	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}
}
