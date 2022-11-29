package pe.com.cybersystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.cybersystem.entity.DetalleVentaEntity;
import pe.com.cybersystem.service.DetalleVentaService;

@RestController
@RequestMapping("/detalleventa")
public class DetalleVentaController {
	
	@Autowired
	private DetalleVentaService servicio;
	
	@GetMapping
	public List<DetalleVentaEntity> findAll(){
		return servicio.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<DetalleVentaEntity> findById(@PathVariable Long id){
		return servicio.findById(id);
	}
	
	@PostMapping
	public DetalleVentaEntity add(@RequestBody DetalleVentaEntity d) {
		return servicio.add(d);
	}
	
}
