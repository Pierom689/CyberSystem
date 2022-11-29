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

import pe.com.cybersystem.entity.UsuarioEntity;
import pe.com.cybersystem.service.UsuarioService;


@RestController
@RequestMapping("/cliente")
public class UsuarioRestController {

	@Autowired
	private UsuarioService servicio;
	
	@GetMapping
	public List<UsuarioEntity>findAll(){
		return servicio.findAll();
	}
	
	
	@GetMapping("/custom")
	public List<UsuarioEntity>findAllCustom(){
		return servicio.findAllCustom();
	}
	

	@GetMapping("/{id}")
	public Optional<UsuarioEntity>findById(@PathVariable Long id){
		return servicio.findById(id);
	}
	
	@PostMapping 
	public UsuarioEntity add(@RequestBody UsuarioEntity r) {
		return servicio.add(r);
	}
	
	@PutMapping("/{id}")
	public UsuarioEntity update(@PathVariable long id, @RequestBody UsuarioEntity r ) {
		r.setCodigo(id);
		return servicio.update(r);
	}
	
	@DeleteMapping("/{id}")
	public UsuarioEntity delete (@PathVariable long id) {
		UsuarioEntity objusuario=new UsuarioEntity();
		objusuario.setEstado(false);
		return servicio.delete(UsuarioEntity.builder().codigo(id).build());
		
	}

}
