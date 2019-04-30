package com.vmx.h2manage.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the report_item database table.
 * 
 */
@Entity
@Table(name="report_item")
public class ReportItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int administrators;

	private int appearby;

	private String displaytitle;

	private String itemdesc;

	private String itemname;

	private String itemtype;

	private String pagename;

	private int PARENTid;

	private String reportitemrelativeurl;

	private String reportitemurl;

	private int users;

	public ReportItem() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAdministrators() {
		return this.administrators;
	}

	public void setAdministrators(int administrators) {
		this.administrators = administrators;
	}

	public int getAppearby() {
		return this.appearby;
	}

	public void setAppearby(int appearby) {
		this.appearby = appearby;
	}

	public String getDisplaytitle() {
		return this.displaytitle;
	}

	public void setDisplaytitle(String displaytitle) {
		this.displaytitle = displaytitle;
	}

	public String getItemdesc() {
		return this.itemdesc;
	}

	public void setItemdesc(String itemdesc) {
		this.itemdesc = itemdesc;
	}

	public String getItemname() {
		return this.itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public String getItemtype() {
		return this.itemtype;
	}

	public void setItemtype(String itemtype) {
		this.itemtype = itemtype;
	}

	public String getPagename() {
		return this.pagename;
	}

	public void setPagename(String pagename) {
		this.pagename = pagename;
	}

	public int getPARENTid() {
		return this.PARENTid;
	}

	public void setPARENTid(int PARENTid) {
		this.PARENTid = PARENTid;
	}

	public String getReportitemrelativeurl() {
		return this.reportitemrelativeurl;
	}

	public void setReportitemrelativeurl(String reportitemrelativeurl) {
		this.reportitemrelativeurl = reportitemrelativeurl;
	}

	public String getReportitemurl() {
		return this.reportitemurl;
	}

	public void setReportitemurl(String reportitemurl) {
		this.reportitemurl = reportitemurl;
	}

	public int getUsers() {
		return this.users;
	}

	public void setUsers(int users) {
		this.users = users;
	}

}