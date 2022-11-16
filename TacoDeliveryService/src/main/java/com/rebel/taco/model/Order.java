package com.rebel.taco.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_order")
public class Order 
{
	@Id
	private int oId;
	
	@OneToMany
	private List<TacoOrder> tacoOrder = new ArrayList<>();

}
