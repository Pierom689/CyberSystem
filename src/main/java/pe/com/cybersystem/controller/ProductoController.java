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

import pe.com.cybersystem.entity.ProductoEntity;
import pe.com.cybersystem.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	private ProductoService servicio;

	@GetMapping
	public List<ProductoEntity> findAll(){
		return servicio.findAll();
	}
	
	@GetMapping("/custom")
	public List<ProductoEntity> findAllCustom(){
		return servicio.findAllCustom();
	}
	
	@GetMapping("/{id}")
	public Optional<ProductoEntity> findById(@PathVariable Long id){
		return servicio.findById(id);
	}
	
	@PostMapping
	public ProductoEntity add(@RequestBody ProductoEntity p) {
		return servicio.add(p);
	}
	
	@PutMapping("/{id}")
	public ProductoEntity update(@PathVariable Long id, @RequestBody ProductoEntity p) {
		p.setIdprod(id);
		return servicio.update(p);
	}
	
	@DeleteMapping("/{id}")
	public ProductoEntity update(@PathVariable Long id) {
		ProductoEntity obj = new ProductoEntity();
		obj.setEstadoprod(false);
		return servicio.delete(ProductoEntity.builder().idprod(id).build());
	}
	
}
