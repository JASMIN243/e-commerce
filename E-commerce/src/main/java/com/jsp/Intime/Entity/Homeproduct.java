package com.jsp.Intime.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the homeproducts database table.
 * 
 */

@Entity
@Table(name="homeproducts")
@NamedQuery(name="Homeproduct.findAll", query="SELECT h FROM Homeproduct h")
public class Homeproduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String companyname;

	private String filepath;

	private String price;

	private String typeofcloth;

	public Homeproduct() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyname() {
		return this.companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getFilepath() {
		return this.filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getTypeofcloth() {
		return this.typeofcloth;
	}

	public void setTypeofcloth(String typeofcloth) {
		this.typeofcloth = typeofcloth;
	}
}
