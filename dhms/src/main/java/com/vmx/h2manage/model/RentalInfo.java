package com.vmx.h2manage.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the rental_info database table.
 * 
 */
@Entity
@Table(name="rental_info")
@NamedQuery(name="RentalInfo.findAll", query="SELECT r FROM RentalInfo r")
public class RentalInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int attr;

	@Column(name="BALANCE_DUE")
	private int balanceDue;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CHECKIN_DT")
	private Date checkinDt;

	@Column(name="CHECKIN_STATUS")
	private String checkinStatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CHECKOUT_DT")
	private Date checkoutDt;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_DT")
	private Timestamp createdDt;

	private int CUSTOMERid;

	private String flag;

	private int folionbr;

	private String groupname;

	private String isgroup;

	@Column(name="LAST_PAYMENT_METHOD")
	private String lastPaymentMethod;

	private String note;

	private String paymentmode;

	private int promcode;

	private int salestype;

	@Column(name="TOTAL_DUE")
	private int totalDue;

	@Column(name="TOTAL_MISC")
	private int totalMisc;

	@Column(name="TOTAL_PAID")
	private int totalPaid;

	@Column(name="TOTAL_RATE")
	private int totalRate;

	@Column(name="TOTAL_TAXES")
	private int totalTaxes;

	public RentalInfo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAttr() {
		return this.attr;
	}

	public void setAttr(int attr) {
		this.attr = attr;
	}

	public int getBalanceDue() {
		return this.balanceDue;
	}

	public void setBalanceDue(int balanceDue) {
		this.balanceDue = balanceDue;
	}

	public Date getCheckinDt() {
		return this.checkinDt;
	}

	public void setCheckinDt(Date checkinDt) {
		this.checkinDt = checkinDt;
	}

	public String getCheckinStatus() {
		return this.checkinStatus;
	}

	public void setCheckinStatus(String checkinStatus) {
		this.checkinStatus = checkinStatus;
	}

	public Date getCheckoutDt() {
		return this.checkoutDt;
	}

	public void setCheckoutDt(Date checkoutDt) {
		this.checkoutDt = checkoutDt;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedDt() {
		return this.createdDt;
	}

	public void setCreatedDt(Timestamp createdDt) {
		this.createdDt = createdDt;
	}

	public int getCUSTOMERid() {
		return this.CUSTOMERid;
	}

	public void setCUSTOMERid(int CUSTOMERid) {
		this.CUSTOMERid = CUSTOMERid;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public int getFolionbr() {
		return this.folionbr;
	}

	public void setFolionbr(int folionbr) {
		this.folionbr = folionbr;
	}

	public String getGroupname() {
		return this.groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public String getIsgroup() {
		return this.isgroup;
	}

	public void setIsgroup(String isgroup) {
		this.isgroup = isgroup;
	}

	public String getLastPaymentMethod() {
		return this.lastPaymentMethod;
	}

	public void setLastPaymentMethod(String lastPaymentMethod) {
		this.lastPaymentMethod = lastPaymentMethod;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getPaymentmode() {
		return this.paymentmode;
	}

	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}

	public int getPromcode() {
		return this.promcode;
	}

	public void setPromcode(int promcode) {
		this.promcode = promcode;
	}

	public int getSalestype() {
		return this.salestype;
	}

	public void setSalestype(int salestype) {
		this.salestype = salestype;
	}

	public int getTotalDue() {
		return this.totalDue;
	}

	public void setTotalDue(int totalDue) {
		this.totalDue = totalDue;
	}

	public int getTotalMisc() {
		return this.totalMisc;
	}

	public void setTotalMisc(int totalMisc) {
		this.totalMisc = totalMisc;
	}

	public int getTotalPaid() {
		return this.totalPaid;
	}

	public void setTotalPaid(int totalPaid) {
		this.totalPaid = totalPaid;
	}

	public int getTotalRate() {
		return this.totalRate;
	}

	public void setTotalRate(int totalRate) {
		this.totalRate = totalRate;
	}

	public int getTotalTaxes() {
		return this.totalTaxes;
	}

	public void setTotalTaxes(int totalTaxes) {
		this.totalTaxes = totalTaxes;
	}

}