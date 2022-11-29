package pe.com.cybersystem.service;

import java.util.List;
import java.util.Optional;

import pe.com.cybersystem.entity.CompraEntity;



public interface CompraService {
	/*Muestra todos los datos*/
	List<CompraEntity>findAll();
	
	/*Mostrar los datos habilitados por el estado*/
	List<CompraEntity>findAllCustom();
	
	/*Buscar por codigo*/
	Optional<CompraEntity> findById(long id);
	
	/*Registrar los datos*/
	CompraEntity add(CompraEntity co);
	
	/*Actualizar los datos*/
	CompraEntity update(CompraEntity co);
	
	/*Eliminar Datos*/
	CompraEntity delete(CompraEntity co);
}
