package com.vmx.h2manage.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the state database table.
 * 
 */
@Entity
public class State implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="STATE_ID")
	private int stateId;

	@Column(name="STATE_ABBR")
	private String stateAbbr;

	@Column(name="STATE_NAME")
	private String stateName;

	public State() {
	}

	public int getStateId() {
		return this.stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStateAbbr() {
		return this.stateAbbr;
	}

	public void setStateAbbr(String stateAbbr) {
		this.stateAbbr = stateAbbr;
	}

	public String getStateName() {
		return this.stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

}