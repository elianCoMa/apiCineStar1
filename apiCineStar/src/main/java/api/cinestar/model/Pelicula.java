package api.cinestar.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pelicula {
	@Id
	private int id ;
	private String Titulo ;
	private String FechaEstreno ;
	private String Director ;
	private String Generos ;
	private int idClasificacion ;
	private int idEstado ;
	private String Duracion ;
	private String Link ;
	private String Reparto ;
	private String Sinopsis ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getFechaEstreno() {
		return FechaEstreno;
	}
	public void setFechaEstreno(String fechaEstreno) {
		FechaEstreno = fechaEstreno;
	}
	public String getDirector() {
		return Director;
	}
	public void setDirector(String director) {
		Director = director;
	}
	public String getGeneros() {
		return Generos;
	}
	public void setGeneros(String generos) {
		Generos = generos;
	}
	public int getIdClasificacion() {
		return idClasificacion;
	}
	public void setIdClasificacion(int idClasificacion) {
		this.idClasificacion = idClasificacion;
	}
	public int getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}
	public String getDuracion() {
		return Duracion;
	}
	public void setDuracion(String duracion) {
		Duracion = duracion;
	}
	public String getLink() {
		return Link;
	}
	public void setLink(String link) {
		Link = link;
	}
	public String getReparto() {
		return Reparto;
	}
	public void setReparto(String reparto) {
		Reparto = reparto;
	}
	public String getSinopsis() {
		return Sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		Sinopsis = sinopsis;
	}
}
