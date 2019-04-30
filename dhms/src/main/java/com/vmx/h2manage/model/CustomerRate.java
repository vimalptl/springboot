package com.vmx.h2manage.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the customer_rate database table.
 * 
 */
@Entity
@Table(name="customer_rate")
public class CustomerRate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RATE_ID")
	private int rateId;

	@Column(name="CREATED_DT")
	private Timestamp createdDt;

	@Column(name="CUST_ID")
	private int custId;

	@Column(name="CUST_RATE")
	private int custRate;

	private String note;

	private String userid;

	public CustomerRate() {
	}

	public int getRateId() {
		return this.rateId;
	}

	public void setRateId(int rateId) {
		this.rateId = rateId;
	}

	public Timestamp getCreatedDt() {
		return this.createdDt;
	}

	public void setCreatedDt(Timestamp createdDt) {
		this.createdDt = createdDt;
	}

	public int getCustId() {
		return this.custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public int getCustRate() {
		return this.custRate;
	}

	public void setCustRate(int custRate) {
		this.custRate = custRate;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

}