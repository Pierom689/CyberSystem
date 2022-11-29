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

import pe.com.cybersystem.entity.RolEntity;
import pe.com.cybersystem.service.RolService;


@RestController
@RequestMapping("/roles")
public class RolRestController {
	@Autowired
	private RolService servicio;
	
	@GetMapping
	public List<RolEntity>findAll(){
		return servicio.findAll();
	}
	
	
	@GetMapping("/custom")
	public List<RolEntity>findAllCustom(){
		return servicio.findAllCustom();
	}
	

	@GetMapping("/{id}")
	public Optional<RolEntity>findById(@PathVariable Long id){
		return servicio.findById(id);
	}
	
	@PostMapping 
	public RolEntity add(@RequestBody RolEntity r) {
		return servicio.add(r);
	}
	
	@PutMapping("/{id}")
	public RolEntity update(@PathVariable long id, @RequestBody RolEntity r ) {
		r.setCodigo(id);
		return servicio.update(r);
	}
	
	@DeleteMapping("/{id}")
	public RolEntity delete (@PathVariable long id) {
		RolEntity objRolEntity=new RolEntity();
		objRolEntity.setEstado(false);
		return servicio.delete(RolEntity.builder().codigo(id).build());
		
	}

}
