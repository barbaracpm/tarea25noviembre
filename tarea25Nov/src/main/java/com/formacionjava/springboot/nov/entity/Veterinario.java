package com.formacionjava.springboot.nov.entity;





import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

	
	
	@Entity
	@Table(name = "veterinario")
	public class Veterinario implements Serializable {
	
						
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private long id;
				
		@Column(nullable = false)
		private String nombre;
				
		@Column(nullable = false, unique=true)
		private String cita;
		
				
		@OneToMany(mappedBy = "veterinario", fetch = FetchType.LAZY,
		cascade = CascadeType.ALL)
		private Set<Mascota> mascota;
			
		public Veterinario (String nombre, String cita, Set<Mascota> mascota) {
				this.cita= cita;
				this.nombre = nombre;
				this.mascota = mascota;
						
		}
		
		
		
			
			public long getId() {
			return id;
		}




		public void setId(long id) {
			this.id = id;
		}




		public String getNombre() {
			return nombre;
		}




		public void setNombre(String nombre) {
			this.nombre = nombre;
		}




		public String getCitas() {
			return cita;
		}




		public void setCitas(String cita) {
			this.cita = cita;
		}




		public Set<Mascota> getMascota() {
			return mascota;
		}




		public void setMascota(Set<Mascota> mascota) {
			this.mascota = mascota;
		}




			private static final long serialVersionUID = 1L;

	
	}

