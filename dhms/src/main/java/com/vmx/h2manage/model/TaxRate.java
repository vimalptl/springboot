package com.vmx.h2manage.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the tax_rates database table.
 * 
 */
@Entity
@Table(name="tax_rates")
public class TaxRate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="CREATED_DT")
	private Timestamp createdDt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="END_DT")
	private Date endDt;

	private int exemptafter;

	private String isexemptallowed;

	private int localtax;

	private int salestax;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="START_DT")
	private Date startDt;

	private int statetax;

	public TaxRate() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getCreatedDt() {
		return this.createdDt;
	}

	public void setCreatedDt(Timestamp createdDt) {
		this.createdDt = createdDt;
	}

	public Date getEndDt() {
		return this.endDt;
	}

	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

	public int getExemptafter() {
		return this.exemptafter;
	}

	public void setExemptafter(int exemptafter) {
		this.exemptafter = exemptafter;
	}

	public String getIsexemptallowed() {
		return this.isexemptallowed;
	}

	public void setIsexemptallowed(String isexemptallowed) {
		this.isexemptallowed = isexemptallowed;
	}

	public int getLocaltax() {
		return this.localtax;
	}

	public void setLocaltax(int localtax) {
		this.localtax = localtax;
	}

	public int getSalestax() {
		return this.salestax;
	}

	public void setSalestax(int salestax) {
		this.salestax = salestax;
	}

	public Date getStartDt() {
		return this.startDt;
	}

	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}

	public int getStatetax() {
		return this.statetax;
	}

	public void setStatetax(int statetax) {
		this.statetax = statetax;
	}

}