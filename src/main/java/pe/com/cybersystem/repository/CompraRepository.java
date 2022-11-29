package pe.com.cybersystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.cybersystem.entity.CompraEntity;

public interface CompraRepository extends JpaRepository<CompraEntity, Long> {
	@Query("select co from CompraEntity co where co.estado= '1'")
	List<CompraEntity> findAllCustom();

}
