package com.vmx.h2manage.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the application_access database table.
 * 
 */
@Entity
@Table(name="application_access")
public class ApplicationAccess implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String createdby;

	@Column(name="CURRENTFOLIO_NBR")
	private int currentfolioNbr;

	@Column(name="PRINT_FOLIO_NBR")
	private String printFolioNbr;

	@Column(name="SAVE_VEHICLE_LICENSE")
	private String saveVehicleLicense;

	@Column(name="UPDATED_DT")
	private Timestamp updatedDt;

	public ApplicationAccess() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public int getCurrentfolioNbr() {
		return this.currentfolioNbr;
	}

	public void setCurrentfolioNbr(int currentfolioNbr) {
		this.currentfolioNbr = currentfolioNbr;
	}

	public String getPrintFolioNbr() {
		return this.printFolioNbr;
	}

	public void setPrintFolioNbr(String printFolioNbr) {
		this.printFolioNbr = printFolioNbr;
	}

	public String getSaveVehicleLicense() {
		return this.saveVehicleLicense;
	}

	public void setSaveVehicleLicense(String saveVehicleLicense) {
		this.saveVehicleLicense = saveVehicleLicense;
	}

	public Timestamp getUpdatedDt() {
		return this.updatedDt;
	}

	public void setUpdatedDt(Timestamp updatedDt) {
		this.updatedDt = updatedDt;
	}

}