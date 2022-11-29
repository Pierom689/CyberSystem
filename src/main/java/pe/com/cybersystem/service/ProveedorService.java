package pe.com.cybersystem.service;

import java.util.List;
import java.util.Optional;

import pe.com.cybersystem.entity.ProveedorEntity;

public interface ProveedorService {

	/*Muestra todos los datos*/
	List<ProveedorEntity>findAll();
	
	/*Mostrar los datos habilitados por el estado*/
	List<ProveedorEntity>findAllCustom();
	
	/*Buscar por codigo*/
	Optional<ProveedorEntity> findById(long id);
	
	/*Registrar los datos*/
	ProveedorEntity add(ProveedorEntity p);
	
	/*Actualizar los datos*/
	ProveedorEntity update(ProveedorEntity p);
	
	/*Eliminar Datos*/
	ProveedorEntity delete(ProveedorEntity p);
}
