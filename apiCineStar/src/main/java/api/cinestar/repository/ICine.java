package api.cinestar.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import api.cinestar.model.Cine;

@Repository
public interface ICine extends JpaRepository<Cine, Integer>{
	@Query(value="{call sp_getCines()}", nativeQuery = true )
	List<Cine> getCines();
}

