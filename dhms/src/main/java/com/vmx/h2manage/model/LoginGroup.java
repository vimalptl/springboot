package com.vmx.h2manage.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the login_group database table.
 * 
 */
@Entity
@Table(name="login_group")
@NamedQuery(name="LoginGroup.findAll", query="SELECT l FROM LoginGroup l")
public class LoginGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int ASSIGNEDCOMPANYid;

	private String groupdescription;

	private String groupname;

	public LoginGroup() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getASSIGNEDCOMPANYid() {
		return this.ASSIGNEDCOMPANYid;
	}

	public void setASSIGNEDCOMPANYid(int ASSIGNEDCOMPANYid) {
		this.ASSIGNEDCOMPANYid = ASSIGNEDCOMPANYid;
	}

	public String getGroupdescription() {
		return this.groupdescription;
	}

	public void setGroupdescription(String groupdescription) {
		this.groupdescription = groupdescription;
	}

	public String getGroupname() {
		return this.groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

}