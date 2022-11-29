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

import pe.com.cybersystem.entity.ReclamoEntity;
import pe.com.cybersystem.service.ReclamoService;

@RestController
@RequestMapping("/reclamo")
public class ReclamoController {

	@Autowired
	private ReclamoService servicio;
	
	@GetMapping
	public List<ReclamoEntity> findAll(){
		return servicio.findAll();
	}
	
	@GetMapping("/custom")
	public List<ReclamoEntity> findAllCustom(){
		return servicio.findAllCustom();
	}
	
	@GetMapping("/{id}")
	public Optional<ReclamoEntity> findById(@PathVariable long id){
		return servicio.findById(id);
	}
	
	@PostMapping
	public ReclamoEntity add(@RequestBody ReclamoEntity r) {
		return servicio.add(r);
	}
	
	@PutMapping("/{id}")
	public ReclamoEntity update(@PathVariable Long id, @RequestBody ReclamoEntity r) {
		r.setIdreclamo(id);
		return servicio.update(r);
	}
	
	@DeleteMapping("/{id}")
	public ReclamoEntity delete(@PathVariable long id) {
		ReclamoEntity objreclamo = new ReclamoEntity();
		objreclamo.setEstado(false);
		return servicio.delete(ReclamoEntity.builder().idreclamo(id).build());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
