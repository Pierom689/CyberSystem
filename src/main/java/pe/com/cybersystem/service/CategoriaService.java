package pe.com.cybersystem.service;

import java.util.List;
import java.util.Optional;

import pe.com.cybersystem.entity.CategoriaEntity;

public interface CategoriaService {
	
	//Mostrar todos los datos
	List<CategoriaEntity> findAll();
	
	//Mostrar datos habilitados
	List<CategoriaEntity> findAllCustom();
	
	//Buscar por codigo
	Optional<CategoriaEntity> findById(Long id);
	
	//Registrar datos
	CategoriaEntity add(CategoriaEntity c);
	
	//Actualizar datos
	CategoriaEntity update(CategoriaEntity c);
	
	//Eliminar datos
	CategoriaEntity delete(CategoriaEntity c);
	
}
