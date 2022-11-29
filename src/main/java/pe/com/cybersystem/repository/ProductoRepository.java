package pe.com.cybersystem.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.cybersystem.entity.ProductoEntity;

public interface ProductoRepository extends JpaRepository<ProductoEntity, Long>{

	@Query("select pro from ProductoEntity pro where pro.estadoprod=1") List<ProductoEntity> findAllCustom();
	
}
