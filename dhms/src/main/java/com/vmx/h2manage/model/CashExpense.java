package com.vmx.h2manage.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the cash_expense database table.
 * 
 */
@Entity
@Table(name="cash_expense")
public class CashExpense implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="EXPENSE_ID")
	private int expenseId;

	@Column(name="CREATED_DT")
	private Timestamp createdDt;

	private String description;

	@Column(name="EXPENSE_AMOUNT")
	private int expenseAmount;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="EXPENSE_DT")
	private Date expenseDt;

	private String tag;

	private String userid;

	public CashExpense() {
	}

	public int getExpenseId() {
		return this.expenseId;
	}

	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}

	public Timestamp getCreatedDt() {
		return this.createdDt;
	}

	public void setCreatedDt(Timestamp createdDt) {
		this.createdDt = createdDt;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getExpenseAmount() {
		return this.expenseAmount;
	}

	public void setExpenseAmount(int expenseAmount) {
		this.expenseAmount = expenseAmount;
	}

	public Date getExpenseDt() {
		return this.expenseDt;
	}

	public void setExpenseDt(Date expenseDt) {
		this.expenseDt = expenseDt;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

}