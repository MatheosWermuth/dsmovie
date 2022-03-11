package com.devsuperior.dsmovie.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user")

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email;

	public User() {
	}

	public User(Long id, String emai) {
		this.id = id;
		this.email = emai;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmai() {
		return email;
	}

	public void setEmai(String emai) {
		this.email = emai;
	}

}
