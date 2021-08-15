package cl.copeuch.tareas.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import javax.validation.constraints.NotNull;


@Entity
@Table(name="tareas")
public class Tarea implements Serializable{

	private static final long serialVersionUID = -1298601107167021553L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long identificador;
	
	//@NotNull(message = "Descripción no puede ser vacío")
	@Column(length=50)
	private String descripcion;
	
	//@NotNull(message = "Fecha de creación no puede ser vacío")
	private Date fechaCreacion;
	
	//@NotNull(message = "Vigente no puede ser vacío")
	private Boolean vigente;
	
	public Long getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Boolean getVigente() {
		return vigente;
	}
	public void setVigente(Boolean vigente) {
		this.vigente = vigente;
	}
	
	
	
}


