package api.cinestar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import api.cinestar.model.Pelicula;

@Repository


public interface IPelicula extends JpaRepository<Pelicula, Integer> {

	
	@Query(value="{call sp_getPelicula(:id)}",nativeQuery = true)
	Pelicula getPelicula(int id);
	
	
	
}
