package com.vmx.h2manage.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the login_user database table.
 * 
 */
@Entity
@Table(name="login_user")
@NamedQuery(name="LoginUser.findAll", query="SELECT l FROM LoginUser l")
public class LoginUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DT")
	private Date createdDt;

	private int lockedout;

	private int LOGINGROUPid;

	private int mustchgpasswordatnextlogin;

	private int nbroffailedlogins;

	private String password;

	@Column(name="PASSWORD_EN")
	private String passwordEn;

	@Temporal(TemporalType.DATE)
	private Date passwordexpirationdate;

	private String status;

	private int unused;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_DT")
	private Timestamp updatedDt;

	private String userid;

	private int viewsensitivedata;

	public LoginUser() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getLockedout() {
		return this.lockedout;
	}

	public void setLockedout(int lockedout) {
		this.lockedout = lockedout;
	}

	public int getLOGINGROUPid() {
		return this.LOGINGROUPid;
	}

	public void setLOGINGROUPid(int LOGINGROUPid) {
		this.LOGINGROUPid = LOGINGROUPid;
	}

	public int getMustchgpasswordatnextlogin() {
		return this.mustchgpasswordatnextlogin;
	}

	public void setMustchgpasswordatnextlogin(int mustchgpasswordatnextlogin) {
		this.mustchgpasswordatnextlogin = mustchgpasswordatnextlogin;
	}

	public int getNbroffailedlogins() {
		return this.nbroffailedlogins;
	}

	public void setNbroffailedlogins(int nbroffailedlogins) {
		this.nbroffailedlogins = nbroffailedlogins;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordEn() {
		return this.passwordEn;
	}

	public void setPasswordEn(String passwordEn) {
		this.passwordEn = passwordEn;
	}

	public Date getPasswordexpirationdate() {
		return this.passwordexpirationdate;
	}

	public void setPasswordexpirationdate(Date passwordexpirationdate) {
		this.passwordexpirationdate = passwordexpirationdate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getUnused() {
		return this.unused;
	}

	public void setUnused(int unused) {
		this.unused = unused;
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

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public int getViewsensitivedata() {
		return this.viewsensitivedata;
	}

	public void setViewsensitivedata(int viewsensitivedata) {
		this.viewsensitivedata = viewsensitivedata;
	}

}