package pe.com.cybersystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.cybersystem.entity.ReclamoEntity;

public interface ReclamoRepository extends JpaRepository<ReclamoEntity, Long> {

	@Query("select r from ReclamoEntity r where r.estado = '1'")
	List<ReclamoEntity>findAllCustom();
}
