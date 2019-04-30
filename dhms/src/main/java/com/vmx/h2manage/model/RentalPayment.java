package com.vmx.h2manage.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the rental_payments database table.
 * 
 */
@Entity
@Table(name="rental_payments")
public class RentalPayment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_DT")
	private Timestamp createdDt;

	private String flag;

	@Column(name="PAY_AMOUNT")
	private int payAmount;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PAY_DT")
	private Date payDt;

	private String paymentdescabbr;

	private int PAYMENTDESCid;

	private int PAYMENTTYPEid;

	private int RENTALid;

	private int RENTALINFOid;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	public RentalPayment() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedDt() {
		return this.createdDt;
	}

	public void setCreatedDt(Timestamp createdDt) {
		this.createdDt = createdDt;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public int getPayAmount() {
		return this.payAmount;
	}

	public void setPayAmount(int payAmount) {
		this.payAmount = payAmount;
	}

	public Date getPayDt() {
		return this.payDt;
	}

	public void setPayDt(Date payDt) {
		this.payDt = payDt;
	}

	public String getPaymentdescabbr() {
		return this.paymentdescabbr;
	}

	public void setPaymentdescabbr(String paymentdescabbr) {
		this.paymentdescabbr = paymentdescabbr;
	}

	public int getPAYMENTDESCid() {
		return this.PAYMENTDESCid;
	}

	public void setPAYMENTDESCid(int PAYMENTDESCid) {
		this.PAYMENTDESCid = PAYMENTDESCid;
	}

	public int getPAYMENTTYPEid() {
		return this.PAYMENTTYPEid;
	}

	public void setPAYMENTTYPEid(int PAYMENTTYPEid) {
		this.PAYMENTTYPEid = PAYMENTTYPEid;
	}

	public int getRENTALid() {
		return this.RENTALid;
	}

	public void setRENTALid(int RENTALid) {
		this.RENTALid = RENTALid;
	}

	public int getRENTALINFOid() {
		return this.RENTALINFOid;
	}

	public void setRENTALINFOid(int RENTALINFOid) {
		this.RENTALINFOid = RENTALINFOid;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

}