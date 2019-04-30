package com.vmx.h2manage.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the room_amenities database table.
 * 
 */
@Entity
@Table(name="room_amenities")
public class RoomAmenity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int AMENITIESid;

	private int ROOMid;

	public RoomAmenity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAMENITIESid() {
		return this.AMENITIESid;
	}

	public void setAMENITIESid(int AMENITIESid) {
		this.AMENITIESid = AMENITIESid;
	}

	public int getROOMid() {
		return this.ROOMid;
	}

	public void setROOMid(int ROOMid) {
		this.ROOMid = ROOMid;
	}

}