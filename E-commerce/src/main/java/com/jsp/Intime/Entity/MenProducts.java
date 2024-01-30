package com.jsp.Intime.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.ToString;
@Data
@Entity
@ToString
public class MenProducts {
	@Id
	private int id;
	private String filePath;
	private String companyName;
	private String price;
	private String typeOfCloth;
	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getCompanyName() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getPrice() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getFilePath() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getTypeOfCloth() {
		// TODO Auto-generated method stub
		return null;
	}
}
