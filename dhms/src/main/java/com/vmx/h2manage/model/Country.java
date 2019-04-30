package com.vmx.h2manage.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the country database table.
 * 
 */
@Entity
public class Country implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="COUNRTY_ID")
	private int counrtyId;

	@Column(name="COUNRTY_ABBR")
	private String counrtyAbbr;

	@Column(name="COUNTRY_NAME")
	private String countryName;

	public Country() {
	}

	public int getCounrtyId() {
		return this.counrtyId;
	}

	public void setCounrtyId(int counrtyId) {
		this.counrtyId = counrtyId;
	}

	public String getCounrtyAbbr() {
		return this.counrtyAbbr;
	}

	public void setCounrtyAbbr(String counrtyAbbr) {
		this.counrtyAbbr = counrtyAbbr;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}