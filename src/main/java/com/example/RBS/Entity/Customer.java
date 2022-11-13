package com.example.RBS.Entity;


import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Customer {

	@Id
	public int customerId;

	public String customerName;

	public String address;

	public String pan;


}

