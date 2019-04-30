package com.vmx.h2manage.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the it_appl_code database table.
 * 
 */
@Embeddable
public class ItApplCodePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CODE_TYPE_ID")
	private int codeTypeId;

	@Column(name="CODE_KEY")
	private String codeKey;

	public ItApplCodePK() {
	}
	public int getCodeTypeId() {
		return this.codeTypeId;
	}
	public void setCodeTypeId(int codeTypeId) {
		this.codeTypeId = codeTypeId;
	}
	public String getCodeKey() {
		return this.codeKey;
	}
	public void setCodeKey(String codeKey) {
		this.codeKey = codeKey;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ItApplCodePK)) {
			return false;
		}
		ItApplCodePK castOther = (ItApplCodePK)other;
		return 
			(this.codeTypeId == castOther.codeTypeId)
			&& this.codeKey.equals(castOther.codeKey);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codeTypeId;
		hash = hash * prime + this.codeKey.hashCode();
		
		return hash;
	}
}