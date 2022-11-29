package pe.com.cybersystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.cybersystem.entity.DetalleVentaEntity;

public interface DetalleVentaRepository extends JpaRepository<DetalleVentaEntity, Long> {
}
