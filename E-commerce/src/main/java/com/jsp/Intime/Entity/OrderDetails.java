package com.jsp.Intime.Entity;

import javax.persistence.Id;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import lombok.Data;
import lombok.ToString;
@Entity
@Data
@ToString
public class OrderDetails {
	@Id
	private int orderId;
	private String name;
	private String mobile;
	private String mail;
	private String address;
	private String city;
	private Date date;
	private String gender;
	private String cNo;
	private Date eDate;
	private int cvv;
	@OneToOne
	@JoinColumn(name = "umobile")
	private User user;
}
