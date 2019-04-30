package com.vmx.h2manage.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the rental database table.
 * 
 */
@Entity
@NamedQuery(name="Rental.findAll", query="SELECT r FROM Rental r")
public class Rental implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="CALC_TAXES")
	private int calcTaxes;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_DT")
	private Timestamp createdDt;

	private int days;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="END_DT")
	private Date endDt;

	private String flag;

	private int folionbr;

	private String grouproomnumber;

	@Column(name="NBR_PERSON")
	private int nbrPerson;

	private String note;

	private String ratetypeabbr;

	private int RENTALINFOid;

	private int RENTALPAYMENTid;

	@Column(name="ROOM_NUMBER")
	private int roomNumber;

	@Column(name="ROOM_RATE")
	private int roomRate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="START_DT")
	private Date startDt;

	private String tax;

	@Column(name="TOTAL_DUE")
	private int totalDue;

	@Column(name="TOTAL_RATE")
	private int totalRate;

	private String userid;

	public Rental() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCalcTaxes() {
		return this.calcTaxes;
	}

	public void setCalcTaxes(int calcTaxes) {
		this.calcTaxes = calcTaxes;
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

	public int getDays() {
		return this.days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public Date getEndDt() {
		return this.endDt;
	}

	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public int getFolionbr() {
		return this.folionbr;
	}

	public void setFolionbr(int folionbr) {
		this.folionbr = folionbr;
	}

	public String getGrouproomnumber() {
		return this.grouproomnumber;
	}

	public void setGrouproomnumber(String grouproomnumber) {
		this.grouproomnumber = grouproomnumber;
	}

	public int getNbrPerson() {
		return this.nbrPerson;
	}

	public void setNbrPerson(int nbrPerson) {
		this.nbrPerson = nbrPerson;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getRatetypeabbr() {
		return this.ratetypeabbr;
	}

	public void setRatetypeabbr(String ratetypeabbr) {
		this.ratetypeabbr = ratetypeabbr;
	}

	public int getRENTALINFOid() {
		return this.RENTALINFOid;
	}

	public void setRENTALINFOid(int RENTALINFOid) {
		this.RENTALINFOid = RENTALINFOid;
	}

	public int getRENTALPAYMENTid() {
		return this.RENTALPAYMENTid;
	}

	public void setRENTALPAYMENTid(int RENTALPAYMENTid) {
		this.RENTALPAYMENTid = RENTALPAYMENTid;
	}

	public int getRoomNumber() {
		return this.roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getRoomRate() {
		return this.roomRate;
	}

	public void setRoomRate(int roomRate) {
		this.roomRate = roomRate;
	}

	public Date getStartDt() {
		return this.startDt;
	}

	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}

	public String getTax() {
		return this.tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	public int getTotalDue() {
		return this.totalDue;
	}

	public void setTotalDue(int totalDue) {
		this.totalDue = totalDue;
	}

	public int getTotalRate() {
		return this.totalRate;
	}

	public void setTotalRate(int totalRate) {
		this.totalRate = totalRate;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

}