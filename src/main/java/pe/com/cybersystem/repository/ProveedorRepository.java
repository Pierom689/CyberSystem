package pe.com.cybersystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.cybersystem.entity.ProveedorEntity;

public interface ProveedorRepository extends JpaRepository<ProveedorEntity, Long> {
	@Query("select p from ProveedorEntity p where p.estado = 1")
	List<ProveedorEntity> findAllCustom();

}
