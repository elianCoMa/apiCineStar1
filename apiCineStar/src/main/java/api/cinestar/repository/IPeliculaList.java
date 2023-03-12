package api.cinestar.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import api.cinestar.model.PeliculaList;

@Repository
public interface IPeliculaList extends JpaRepository<PeliculaList, Integer>{

	@Query(value ="{call sp_getPeliculas(:id)}" , nativeQuery = true )
	List<PeliculaList> getPeliculas(int id);
}
