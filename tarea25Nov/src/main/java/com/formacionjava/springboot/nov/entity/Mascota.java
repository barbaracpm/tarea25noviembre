package com.formacionjava.springboot.nov.entity;


import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mascota")
public class Mascota implements Serializable {

					
			@Id
			@GeneratedValue(strategy= GenerationType.IDENTITY)
			private long id;
			
			@OneToOne(mappedBy = "mascota" )
			private String dniNumber;
			
			@Column(nullable = false)
			private String nombre;
			
			@ManyToMany
			@Column(nullable = false)
			Set<Cliente> cliente;
			
			
			@ManyToOne(fetch = FetchType.LAZY, optional = false)
			@JoinColumn(name = "veterinario_id", nullable = false)
			@Column(nullable = false)
			private String veterinario;
			
			@Column(nullable = false, unique=true)
			private String clinica;
			
			@Column(nullable = false, unique=true)
			private String cita;
			
			
			private static final long serialVersionUID = 1L;

	
	}
