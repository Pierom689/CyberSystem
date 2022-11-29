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

import pe.com.cybersystem.entity.*;
import pe.com.cybersystem.service.EmpleadoService;

@RestController
@RequestMapping("/empleados")
public class EmpleadoRestController {
	
	@Autowired
	private EmpleadoService servicio;
	
	@GetMapping
	public List<EmpleadoEntity>findAll(){
		return servicio.findAll();
	}
	
	
	@GetMapping("/custom")
	public List<EmpleadoEntity>findAllCustom(){
		return servicio.findAllCustom();
	}
	

	@GetMapping("/{id}")
	public Optional<EmpleadoEntity>findById(@PathVariable Long id){
		return servicio.findById(id);
	}
	
	@PostMapping 
	public EmpleadoEntity add(@RequestBody EmpleadoEntity r) {
		return servicio.add(r);
	}
	
	@PutMapping("/{id}")
	public EmpleadoEntity update(@PathVariable long id, @RequestBody EmpleadoEntity r ) {
		r.setCodigo(id);
		return servicio.update(r);
	}
	
	@DeleteMapping("/{id}")
	public EmpleadoEntity delete (@PathVariable long id) {
		EmpleadoEntity objeempleado=new EmpleadoEntity();
		objeempleado.setEstado(false);
		return servicio.delete(EmpleadoEntity.builder().codigo(id).build());
		
	}

}
