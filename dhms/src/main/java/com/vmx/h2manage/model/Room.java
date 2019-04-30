package com.vmx.h2manage.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the room database table.
 * 
 */
@Entity
public class Room implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int active;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_DT")
	private Date createdDt;

	private String definition;

	@Column(name="DISPLAY_X")
	private int displayX;

	@Column(name="DISPLAY_Y")
	private int displayY;

	private int displaygroup;

	@Column(name="ROOM_NBR")
	private String roomNbr;

	private int ROOMTYPEid;

	private int servicegroup;

	private int status;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_DT")
	private Timestamp updatedDt;

	public Room() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getActive() {
		return this.active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDt() {
		return this.createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	public String getDefinition() {
		return this.definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public int getDisplayX() {
		return this.displayX;
	}

	public void setDisplayX(int displayX) {
		this.displayX = displayX;
	}

	public int getDisplayY() {
		return this.displayY;
	}

	public void setDisplayY(int displayY) {
		this.displayY = displayY;
	}

	public int getDisplaygroup() {
		return this.displaygroup;
	}

	public void setDisplaygroup(int displaygroup) {
		this.displaygroup = displaygroup;
	}

	public String getRoomNbr() {
		return this.roomNbr;
	}

	public void setRoomNbr(String roomNbr) {
		this.roomNbr = roomNbr;
	}

	public int getROOMTYPEid() {
		return this.ROOMTYPEid;
	}

	public void setROOMTYPEid(int ROOMTYPEid) {
		this.ROOMTYPEid = ROOMTYPEid;
	}

	public int getServicegroup() {
		return this.servicegroup;
	}

	public void setServicegroup(int servicegroup) {
		this.servicegroup = servicegroup;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Timestamp getUpdatedDt() {
		return this.updatedDt;
	}

	public void setUpdatedDt(Timestamp updatedDt) {
		this.updatedDt = updatedDt;
	}

}