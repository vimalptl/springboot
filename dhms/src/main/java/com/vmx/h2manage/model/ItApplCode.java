package com.vmx.h2manage.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the it_appl_code database table.
 * 
 */
@Entity
@Table(name="it_appl_code")
public class ItApplCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ItApplCodePK id;

	@Column(name="CODE_DESC")
	private String codeDesc;

	@Column(name="CODE_VALUE")
	private String codeValue;

	public ItApplCode() {
	}

	public ItApplCodePK getId() {
		return this.id;
	}

	public void setId(ItApplCodePK id) {
		this.id = id;
	}

	public String getCodeDesc() {
		return this.codeDesc;
	}

	public void setCodeDesc(String codeDesc) {
		this.codeDesc = codeDesc;
	}

	public String getCodeValue() {
		return this.codeValue;
	}

	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}

}