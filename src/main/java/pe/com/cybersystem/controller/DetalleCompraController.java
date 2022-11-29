package pe.com.cybersystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.cybersystem.entity.DetalleCompraEntity;
import pe.com.cybersystem.service.DetalleCompraService;

@RestController
@RequestMapping("/detallecompra")
public class DetalleCompraController {

	@Autowired
	private DetalleCompraService servicio;
	
	@GetMapping
	public List<DetalleCompraEntity> findAll(){
		return servicio.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<DetalleCompraEntity>findById(@PathVariable Long id){
		return servicio.findById(id);
	}
	
	@PostMapping
	public DetalleCompraEntity add(@RequestBody DetalleCompraEntity d) {
		return servicio.add(d);
	}
	
	
	@PutMapping("/{id}")
	public DetalleCompraEntity update(@PathVariable long id, @RequestBody DetalleCompraEntity d) {
		d.setIddetallecompra(id);
		return servicio.update(d);
	}
	
}
