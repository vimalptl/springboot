package com.vmx.h2manage.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the type_definition database table.
 * 
 */
@Entity
@Table(name="type_definition")
public class TypeDefinition implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String charvalue;

	private String description;

	private String fieldname;

	private String intvalue;

	public TypeDefinition() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCharvalue() {
		return this.charvalue;
	}

	public void setCharvalue(String charvalue) {
		this.charvalue = charvalue;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFieldname() {
		return this.fieldname;
	}

	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}

	public String getIntvalue() {
		return this.intvalue;
	}

	public void setIntvalue(String intvalue) {
		this.intvalue = intvalue;
	}

}