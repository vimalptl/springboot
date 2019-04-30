package com.vmx.h2manage.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the reservation database table.
 * 
 */
@Entity
public class Reservation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String addr1;

	private String ccexpdate;

	private String ccnbr;

	private String city;

	private String country;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_DT")
	private Timestamp createdDt;

	@Column(name="CUSTOMER_NAME")
	private String customerName;

	private int CUSTOMERid;

	private String email;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="END_DT")
	private Date endDt;

	@Column(name="NAME_FIRST")
	private String nameFirst;

	@Column(name="NAME_LAST")
	private String nameLast;

	@Column(name="NBR_PERSON")
	private int nbrPerson;

	private int nbrofdays;

	private String note;

	private String paymenttype;

	private String phone;

	private String resnumber;

	@Column(name="ROOM_DEFINITION")
	private String roomDefinition;

	@Column(name="ROOM_NUMBER")
	private String roomNumber;

	@Column(name="ROOM_RATE")
	private int roomRate;

	@Column(name="ROOM_TYPE")
	private String roomType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="START_DT")
	private Date startDt;

	private String state;

	private String status;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	private String zip;

	public Reservation() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddr1() {
		return this.addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getCcexpdate() {
		return this.ccexpdate;
	}

	public void setCcexpdate(String ccexpdate) {
		this.ccexpdate = ccexpdate;
	}

	public String getCcnbr() {
		return this.ccnbr;
	}

	public void setCcnbr(String ccnbr) {
		this.ccnbr = ccnbr;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCUSTOMERid() {
		return this.CUSTOMERid;
	}

	public void setCUSTOMERid(int CUSTOMERid) {
		this.CUSTOMERid = CUSTOMERid;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getEndDt() {
		return this.endDt;
	}

	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

	public String getNameFirst() {
		return this.nameFirst;
	}

	public void setNameFirst(String nameFirst) {
		this.nameFirst = nameFirst;
	}

	public String getNameLast() {
		return this.nameLast;
	}

	public void setNameLast(String nameLast) {
		this.nameLast = nameLast;
	}

	public int getNbrPerson() {
		return this.nbrPerson;
	}

	public void setNbrPerson(int nbrPerson) {
		this.nbrPerson = nbrPerson;
	}

	public int getNbrofdays() {
		return this.nbrofdays;
	}

	public void setNbrofdays(int nbrofdays) {
		this.nbrofdays = nbrofdays;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getPaymenttype() {
		return this.paymenttype;
	}

	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getResnumber() {
		return this.resnumber;
	}

	public void setResnumber(String resnumber) {
		this.resnumber = resnumber;
	}

	public String getRoomDefinition() {
		return this.roomDefinition;
	}

	public void setRoomDefinition(String roomDefinition) {
		this.roomDefinition = roomDefinition;
	}

	public String getRoomNumber() {
		return this.roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getRoomRate() {
		return this.roomRate;
	}

	public void setRoomRate(int roomRate) {
		this.roomRate = roomRate;
	}

	public String getRoomType() {
		return this.roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public Date getStartDt() {
		return this.startDt;
	}

	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}