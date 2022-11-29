package pe.com.cybersystem.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.cybersystem.entity.ProveedorEntity;
import pe.com.cybersystem.service.ProveedorService;

@RestController
@RequestMapping("/proveedor")
public class ProveedorController {

	
	@Autowired
	private ProveedorService servicio;
	
	/*Metodo para Listar todos los elementos*/
	@GetMapping
	public List<ProveedorEntity> findAll(){
		return servicio.findAll();
	}
	
	/*Metodo para Listar los elementos con estado 1*/
	@GetMapping("/custom")
	public List<ProveedorEntity> findAllCustom(){
		return servicio.findAllCustom();
	}
	
	/*Metodo para Listar los elementos con id*/
	@GetMapping("/{id}")
	public Optional<ProveedorEntity> findById(@PathVariable Long id){
		return servicio.findById(id);
	}
	
	/*Metodo para Listar los elementos con estado 1*/
	@PostMapping
	public ProveedorEntity add(@RequestBody ProveedorEntity p) {
		return servicio.add(p);
	}
	
	@PutMapping("/{id}")
	public ProveedorEntity update(@PathVariable Long id,@RequestBody ProveedorEntity p) {
		p.setIdproveedor(id);
		return servicio.update(p);
	}
	
	@DeleteMapping("/{id}")
	public ProveedorEntity update(@PathVariable Long id) {
		ProveedorEntity obj = new ProveedorEntity();
		obj.setEstado(false);
		return servicio.delete(ProveedorEntity.builder().idproveedor(id).build());
	}
}
