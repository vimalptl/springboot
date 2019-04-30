package com.vmx.h2manage.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the rate_types database table.
 * 
 */
@Entity
@Table(name="rate_types")
@NamedQuery(name="RateType.findAll", query="SELECT r FROM RateType r")
public class RateType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int days;

	@Column(name="RATE_TYPE")
	private String rateType;

	@Column(name="RATETYPE_ABBR")
	private String ratetypeAbbr;

	public RateType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDays() {
		return this.days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public String getRateType() {
		return this.rateType;
	}

	public void setRateType(String rateType) {
		this.rateType = rateType;
	}

	public String getRatetypeAbbr() {
		return this.ratetypeAbbr;
	}

	public void setRatetypeAbbr(String ratetypeAbbr) {
		this.ratetypeAbbr = ratetypeAbbr;
	}

}