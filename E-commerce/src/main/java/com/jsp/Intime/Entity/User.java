package com.jsp.Intime.Entity;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.ToString;
@Data
@Entity
@ToString
public class User {
	@Id
	private String userMobileNo;
	private String userEmail;
	private String userName;
	private String userPassword;
	public Object getUserPassword() {
		// TODO Auto-generated method stub
		return null;
	}

}
