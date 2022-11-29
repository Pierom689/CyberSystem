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

import pe.com.cybersystem.entity.VentaEntity;
import pe.com.cybersystem.service.VentaService;

@RestController
@RequestMapping("/ventas")
public class VentaController {
	@Autowired
	private VentaService servicio;
	
	@GetMapping
	public List<VentaEntity>findAll(){
		return servicio.findAll();
	}
	
	@GetMapping("/custom")
	public List<VentaEntity> findAllCustom(){
		return servicio.findAllCustom();
	}
	
	@GetMapping("/{id}")
	public Optional<VentaEntity> findById(@PathVariable Long id){
		return servicio.findById(id);
	}
	
	@PostMapping
	public VentaEntity add(@RequestBody VentaEntity v) {
		return servicio.add(v);
	}
	
	@PutMapping("/{id}")
	public VentaEntity update(@PathVariable Long id, @RequestBody VentaEntity v) {
		v.setIdpedido(id);
		return servicio.update(v);
	}
	
	@DeleteMapping("/{id}")
	public VentaEntity delete(@PathVariable Long id) {
		VentaEntity obj = new VentaEntity();
		obj.setEstado(false);
		return servicio.delete(VentaEntity.builder().idpedido(id).build());
	}
}
