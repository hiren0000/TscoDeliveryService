package com.rebel.taco.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_tacoorder")
public class TacoOrder 
{
	@Id
	private int count;
	private String taco_name;
	private double taco_price;

}
