package pe.com.cybersystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.cybersystem.entity.*;

public interface EmpleadoRepository extends JpaRepository<EmpleadoEntity, Long>{
	@Query("select e from EmpleadoEntity e where e.estado=1")
	List<EmpleadoEntity>findAllCustom();
}
