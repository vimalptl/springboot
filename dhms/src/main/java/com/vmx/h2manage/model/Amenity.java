package com.vmx.h2manage.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the amenities database table.
 * 
 */
@Entity
@Table(name="amenities")
public class Amenity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int keyid;

	private String description;

	public Amenity() {
	}

	public int getKeyid() {
		return this.keyid;
	}

	public void setKeyid(int keyid) {
		this.keyid = keyid;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}