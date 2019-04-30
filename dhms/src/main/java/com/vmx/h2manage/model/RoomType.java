package com.vmx.h2manage.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the room_type database table.
 * 
 */
@Entity
@Table(name="room_type")
public class RoomType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String color;

	@Column(name="ROOM_ABBR")
	private String roomAbbr;

	@Column(name="ROOM_DESC")
	private String roomDesc;

	@Column(name="ROOM_TYPE")
	private String roomType;

	public RoomType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRoomAbbr() {
		return this.roomAbbr;
	}

	public void setRoomAbbr(String roomAbbr) {
		this.roomAbbr = roomAbbr;
	}

	public String getRoomDesc() {
		return this.roomDesc;
	}

	public void setRoomDesc(String roomDesc) {
		this.roomDesc = roomDesc;
	}

	public String getRoomType() {
		return this.roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

}