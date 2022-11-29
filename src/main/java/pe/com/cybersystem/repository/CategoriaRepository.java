package pe.com.cybersystem.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.cybersystem.entity.CategoriaEntity;

public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Long>{
	
	@Query("select cat from CategoriaEntity cat where cat.estadocat=1") List<CategoriaEntity> findAllCustom();
	
}
