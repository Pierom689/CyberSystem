package pe.com.cybersystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.cybersystem.entity.VentaEntity;

public interface VentaRepository extends JpaRepository<VentaEntity, Long> {
	@Query("select e from VentaEntity e where e.estado=1")
	List<VentaEntity>findAllCustom();
}
