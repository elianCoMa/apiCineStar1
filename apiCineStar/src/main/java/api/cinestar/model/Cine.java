package api.cinestar.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity

public class Cine {
	
	@Id
	private int id;
	private String RazonSocial;
	private int Salas;
	private int idDistrito;
	private String Direccion;
	private String Telefonos;
	private String Detalle;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRazonSocial() {
		return RazonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		RazonSocial = razonSocial;
	}
	public int getSalas() {
		return Salas;
	}
	public void setSalas(int salas) {
		Salas = salas;
	}
	public int getIdDistrito() {
		return idDistrito;
	}
	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getTelefonos() {
		return Telefonos;
	}
	public void setTelefonos(String telefonos) {
		Telefonos = telefonos;
	}
	public String getDetalle() {
		return Detalle;
	}
	public void setDetalle(String detalle) {
		Detalle = detalle;
	}
	
	
	
	
	
}
