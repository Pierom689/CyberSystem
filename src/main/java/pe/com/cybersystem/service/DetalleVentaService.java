package pe.com.cybersystem.service;

import java.util.List;
import java.util.Optional;

import pe.com.cybersystem.entity.DetalleVentaEntity;

public interface DetalleVentaService {
	
	List<DetalleVentaEntity> findAll();
	
	//Mostar todos los datos
	Optional<DetalleVentaEntity> findById(Long id);
	
	//Buscar por codigo
	DetalleVentaEntity add(DetalleVentaEntity d);
}
