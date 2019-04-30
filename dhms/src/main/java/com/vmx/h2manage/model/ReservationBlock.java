package com.vmx.h2manage.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the reservation_blocks database table.
 * 
 */
@Entity
@Table(name="reservation_blocks")
public class ReservationBlock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String createdby;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="END_DT")
	private Date endDt;

	@Column(name="ROOM_COUNT")
	private int roomCount;

	@Column(name="ROOM_TYPE")
	private int roomType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="START_DT")
	private Date startDt;

	@Column(name="UPDATED_DT")
	private Timestamp updatedDt;

	public ReservationBlock() {
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

	public Date getEndDt() {
		return this.endDt;
	}

	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

	public int getRoomCount() {
		return this.roomCount;
	}

	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}

	public int getRoomType() {
		return this.roomType;
	}

	public void setRoomType(int roomType) {
		this.roomType = roomType;
	}

	public Date getStartDt() {
		return this.startDt;
	}

	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}

	public Timestamp getUpdatedDt() {
		return this.updatedDt;
	}

	public void setUpdatedDt(Timestamp updatedDt) {
		this.updatedDt = updatedDt;
	}

}