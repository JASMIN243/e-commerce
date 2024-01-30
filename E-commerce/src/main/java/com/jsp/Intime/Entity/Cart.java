package com.jsp.Intime.Entity;

//import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Data
@ToString

public class Cart {
	@Id
private Integer id;
private String Filepath;
private String Price;
private String Typeofcloth;
private String Companyname;
//@Column(name="User_Mobile")
@OneToOne
private User user;
public void setCompanyname(Object companyName) {
	// TODO Auto-generated method stub
	
}
public void setId(Object id2) {
	// TODO Auto-generated method stub
	
}
public void setTypeofcloth(Object typeOfCloth2) {
	// TODO Auto-generated method stub
	
}
public void setFilepath(Object filePath2) {
	// TODO Auto-generated method stub
	
}
public void setUser(com.jsp.Intime.Entity.User attribute) {
	// TODO Auto-generated method stub
	
}
public void setPrice(Object price2) {
	// TODO Auto-generated method stub
	
}

 
}
