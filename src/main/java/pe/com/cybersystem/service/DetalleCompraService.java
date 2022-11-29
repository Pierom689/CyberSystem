package pe.com.cybersystem.service;

import java.util.List;
import java.util.Optional;

import pe.com.cybersystem.entity.DetalleCompraEntity;



public interface DetalleCompraService {
	/*Muestra todos los datos*/
	List<DetalleCompraEntity>findAll();
	
	/*Buscar por codigo*/
	Optional<DetalleCompraEntity> findById(long id);
	
	/*Registrar los datos*/
	DetalleCompraEntity add(DetalleCompraEntity d);
	
	/*Actualizar los datos*/
	DetalleCompraEntity update(DetalleCompraEntity d);

}
