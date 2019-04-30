package com.vmx.h2manage.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the customer_dnr database table.
 * 
 */
@Entity
@Table(name="customer_dnr")
public class CustomerDnr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String createdby;

	private int CUSTOMERid;

	private String dnrinfo;

	@Temporal(TemporalType.DATE)
	@Column(name="MARKING_DT")
	private Date markingDt;

	@Column(name="ROOM_NUMBER")
	private String roomNumber;

	public CustomerDnr() {
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

	public int getCUSTOMERid() {
		return this.CUSTOMERid;
	}

	public void setCUSTOMERid(int CUSTOMERid) {
		this.CUSTOMERid = CUSTOMERid;
	}

	public String getDnrinfo() {
		return this.dnrinfo;
	}

	public void setDnrinfo(String dnrinfo) {
		this.dnrinfo = dnrinfo;
	}

	public Date getMarkingDt() {
		return this.markingDt;
	}

	public void setMarkingDt(Date markingDt) {
		this.markingDt = markingDt;
	}

	public String getRoomNumber() {
		return this.roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

}