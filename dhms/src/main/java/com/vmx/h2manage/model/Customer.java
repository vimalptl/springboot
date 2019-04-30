package com.vmx.h2manage.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the customer database table.
 * 
 */
@Entity
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CUST_ID")
	private int custId;

	private String addr1;

	private String addr2;

	private String city;

	private String company;

	private String country;

	@Column(name="CREATED_DT")
	private Timestamp createdDt;

	@Column(name="CUSTOMER_NAME")
	private String name;

	private String dnr;

	private String email;

	private String fax;

	@Column(name="ID_NUMBER")
	private String idNumber;

	@Column(name="ID_TYPE")
	private String idType;

	private String imgfile;

	@Column(name="NAME_FIRST")
	private String nameFirst;

	@Column(name="NAME_LAST")
	private String nameLast;

	private String note;

	private String phone;

	private String state;

	@Lob
	private String swipedata;

	private String userid;

	private String zip;

	public Customer() {
	}

	public int getCustId() {
		return this.custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getAddr1() {
		return this.addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return this.addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Timestamp getCreatedDt() {
		return this.createdDt;
	}

	public void setCreatedDt(Timestamp createdDt) {
		this.createdDt = createdDt;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String customerName) {
		this.name = customerName;
	}

	public String getDnr() {
		return this.dnr;
	}

	public void setDnr(String dnr) {
		this.dnr = dnr;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getIdNumber() {
		return this.idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getIdType() {
		return this.idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getImgfile() {
		return this.imgfile;
	}

	public void setImgfile(String imgfile) {
		this.imgfile = imgfile;
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

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSwipedata() {
		return this.swipedata;
	}

	public void setSwipedata(String swipedata) {
		this.swipedata = swipedata;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}