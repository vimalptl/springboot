package com.vmx.h2manage.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the payment_type database table.
 * 
 */
@Entity
@Table(name="payment_type")
@NamedQuery(name="PaymentType.findAll", query="SELECT p FROM PaymentType p")
public class PaymentType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String group;

	private String ISActive;

	private String paymentType;

	public PaymentType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroup() {
		return this.group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getISActive() {
		return this.ISActive;
	}

	public void setISActive(String ISActive) {
		this.ISActive = ISActive;
	}

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

}