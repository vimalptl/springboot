package com.vmx.h2manage.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the login_group_permissions database table.
 * 
 */
@Entity
@Table(name="login_group_permissions")
@NamedQuery(name="LoginGroupPermission.findAll", query="SELECT l FROM LoginGroupPermission l")
public class LoginGroupPermission implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int LOGINGROUPid;

	private int REPORTITEMid;

	public LoginGroupPermission() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLOGINGROUPid() {
		return this.LOGINGROUPid;
	}

	public void setLOGINGROUPid(int LOGINGROUPid) {
		this.LOGINGROUPid = LOGINGROUPid;
	}

	public int getREPORTITEMid() {
		return this.REPORTITEMid;
	}

	public void setREPORTITEMid(int REPORTITEMid) {
		this.REPORTITEMid = REPORTITEMid;
	}

}