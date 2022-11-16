package com.rebel.taco.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="t_delivery")
public class Delivery
{
	@Id
	private int dId;
	private Date dateTime;
	
	@OneToOne
	private Order order;

}
