package pe.com.cybersystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.cybersystem.entity.CategoriaEntity;
import pe.com.cybersystem.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	private CategoriaService servicio;

	@GetMapping
	public List<CategoriaEntity> findAll(){
		return servicio.findAll();
	}
	
	@GetMapping("/custom")
	public List<CategoriaEntity> findAllCustom(){
		return servicio.findAllCustom();
	}
	
	@GetMapping("/{id}")
	public Optional<CategoriaEntity> findById(@PathVariable Long id){
		return servicio.findById(id);
	}
	
	@PostMapping
	public CategoriaEntity add(@RequestBody CategoriaEntity c) {
		return servicio.add(c);
	}
	
	@PutMapping("/{id}")
	public CategoriaEntity update(@PathVariable Long id, @RequestBody CategoriaEntity c) {
		c.setIdcat(id);
		return servicio.update(c);
	}
	
	@DeleteMapping("/{id}")
	public CategoriaEntity update(@PathVariable Long id) {
		CategoriaEntity obj = new CategoriaEntity();
		obj.setEstadocat(false);
		return servicio.delete(CategoriaEntity.builder().idcat(id).build());
	}
	
}
