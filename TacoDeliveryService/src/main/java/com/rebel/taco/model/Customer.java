package com.rebel.taco.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "T_customer")
@NoArgsConstructor
@Getter
@Setter
public class Customer 
{
	@Id
	private int cId;
	private String cUsername;
	private String cPassword;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Order> order = new ArrayList<>();
	
}
