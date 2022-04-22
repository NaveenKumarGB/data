
package com.zensar.bean;

public class Address {
	int addressId;
	String cityName;
	String pincode;
	Employee employee;

	public Address(int addressId, String cityName, String pincode, Employee employee) {
		super();
		this.addressId = addressId;
		this.cityName = cityName;
		this.pincode = pincode;
		this.employee = employee;
	}

	public Address(String cityName, String pincode, Employee employee) {
		super();
		this.cityName = cityName;
		this.pincode = pincode;
		this.employee = employee;
	}

	public Address(int addressId) {
		super();
		this.addressId = addressId;
	}

	public Address() {
		super();
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", cityName=" + cityName + ", pincode=" + pincode + "]";
	}
}
