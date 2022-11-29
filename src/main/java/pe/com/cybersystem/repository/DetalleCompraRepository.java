package pe.com.cybersystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.cybersystem.entity.DetalleCompraEntity;

public interface DetalleCompraRepository extends JpaRepository<DetalleCompraEntity, Long> {
	
	
}
