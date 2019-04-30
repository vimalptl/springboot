package com.vmx.h2manage.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the payment_desc database table.
 * 
 */
@Entity
@Table(name="payment_desc")
@NamedQuery(name="PaymentDesc.findAll", query="SELECT p FROM PaymentDesc p")
public class PaymentDesc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String abbr;

	private String description;

	public PaymentDesc() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAbbr() {
		return this.abbr;
	}

	public void setAbbr(String abbr) {
		this.abbr = abbr;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}