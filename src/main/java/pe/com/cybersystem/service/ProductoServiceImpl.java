package pe.com.cybersystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.cybersystem.entity.ProductoEntity;
import pe.com.cybersystem.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired 
	private ProductoRepository repository;
	
	@Override
	public List<ProductoEntity> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<ProductoEntity> findAllCustom() {
		// TODO Auto-generated method stub
		return repository.findAllCustom();
	}

	@Override
	public Optional<ProductoEntity> findById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public ProductoEntity add(ProductoEntity p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public ProductoEntity update(ProductoEntity p) {
		// TODO Auto-generated method stub
		ProductoEntity obj = repository.getById(p.getIdprod());
        BeanUtils.copyProperties(p, obj);
        return repository.save(obj);
	}

	@Override
	public ProductoEntity delete(ProductoEntity p) {
		// TODO Auto-generated method stub
		ProductoEntity obj = repository.getById(p.getIdprod());
		obj.setEstadoprod(false);
        return repository.save(obj);
	}

}
