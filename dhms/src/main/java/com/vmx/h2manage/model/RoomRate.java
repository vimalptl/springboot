package com.vmx.h2manage.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the room_rates database table.
 * 
 */
@Entity
@Table(name="room_rates")
public class RoomRate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="CREATED_DT")
	private Timestamp createdDt;

	private String createdby;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="END_DT")
	private Date endDt;

	private int rate;

	private String ratetypeabbr;

	@Column(name="ROOM_NUMBER")
	private String roomNumber;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="START_DT")
	private Date startDt;

	private String weekdays;

	private int weekendrate;

	public RoomRate() {
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

	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Date getEndDt() {
		return this.endDt;
	}

	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

	public int getRate() {
		return this.rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getRatetypeabbr() {
		return this.ratetypeabbr;
	}

	public void setRatetypeabbr(String ratetypeabbr) {
		this.ratetypeabbr = ratetypeabbr;
	}

	public String getRoomNumber() {
		return this.roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getStartDt() {
		return this.startDt;
	}

	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}

	public String getWeekdays() {
		return this.weekdays;
	}

	public void setWeekdays(String weekdays) {
		this.weekdays = weekdays;
	}

	public int getWeekendrate() {
		return this.weekendrate;
	}

	public void setWeekendrate(int weekendrate) {
		this.weekendrate = weekendrate;
	}

}