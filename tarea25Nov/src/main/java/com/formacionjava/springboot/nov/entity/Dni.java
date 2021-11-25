package com.formacionjava.springboot.nov.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dni")
public class Dni {
	
	
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private long id;
		
		@Column(nullable = false, unique=true)
		private String dniNumber;
		
		
		@OneToOne
		@JoinColumn(name = "mascota_id")
	private Mascota mascota;


		
	}


