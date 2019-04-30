package com.vmx.h2manage.model;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the customer_vehicle database table.
 * 
 */
@Entity
@Table(name="customer_vehicle")
public class CustomerVehicle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String color;

	private String createdby;

	private int CUSTOMERid;

	private String license;

	private String make;

	private String state;

	public CustomerVehicle() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public int getCUSTOMERid() {
		return this.CUSTOMERid;
	}

	public void setCUSTOMERid(int CUSTOMERid) {
		this.CUSTOMERid = CUSTOMERid;
	}

	public String getLicense() {
		return this.license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}