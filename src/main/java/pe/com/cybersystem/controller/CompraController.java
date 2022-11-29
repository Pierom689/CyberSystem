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

import pe.com.cybersystem.entity.CompraEntity;

import pe.com.cybersystem.service.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {
	
	@Autowired
	private CompraService servicio;
	
	@GetMapping
	public List<CompraEntity> findAll(){
		return servicio.findAll();
	}
	
	@GetMapping("/custom")
	public List<CompraEntity> findAllCustom(){
		return servicio.findAllCustom();
	}
	
	@GetMapping("/{id}")
	public Optional<CompraEntity> findById(@PathVariable Long id){
		return servicio.findById(id);
	}
	
	@PostMapping
	public CompraEntity add(@RequestBody CompraEntity co) {
		return servicio.add(co);
	}
	
	@PutMapping("/{id}")
	public CompraEntity update(@PathVariable Long id, @RequestBody CompraEntity co) {
		co.setIdcompra(id);
		return servicio.update(co);
	}
	
	@DeleteMapping("/{id}")
	public CompraEntity update(@PathVariable Long id) {
		CompraEntity obj = new CompraEntity();
		obj.setEstado(false);
		return servicio.delete(CompraEntity.builder().idcompra(id).build());
	}
}
