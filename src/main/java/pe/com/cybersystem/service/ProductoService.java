package pe.com.cybersystem.service;

import java.util.List;
import java.util.Optional;

import pe.com.cybersystem.entity.ProductoEntity;

public interface ProductoService {
	
	//Mostrar todos los datos
	List<ProductoEntity> findAll();
	
	//Mostrar datos habilitados
	List<ProductoEntity> findAllCustom();
	
	//Buscar por codigo
	Optional<ProductoEntity> findById(Long id);
	
	//Registrar datos
	ProductoEntity add(ProductoEntity p);
	
	//Actualizar datos
	ProductoEntity update(ProductoEntity p);
	
	//Eliminar datos
	ProductoEntity delete(ProductoEntity p);
	
}
