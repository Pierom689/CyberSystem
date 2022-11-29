package pe.com.cybersystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.cybersystem.entity.ProveedorEntity;
import pe.com.cybersystem.repository.ProveedorRepository;

@Service
public class ProveedorServiceImpl implements ProveedorService {

	@Autowired
	private ProveedorRepository repository;
	
	@Override
	public List<ProveedorEntity> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<ProveedorEntity> findAllCustom() {
		// TODO Auto-generated method stub
		return repository.findAllCustom();
	}

	@Override
	public Optional<ProveedorEntity> findById(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public ProveedorEntity add(ProveedorEntity p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public ProveedorEntity update(ProveedorEntity p) {
		// TODO Auto-generated method stub
		ProveedorEntity obj =  repository.getById(p.getIdproveedor());
		BeanUtils.copyProperties(p, obj);
		return repository.save(obj);
			
	}

	@Override
	public ProveedorEntity delete(ProveedorEntity p) {
		// TODO Auto-generated method stub
		ProveedorEntity obj =  repository.getById(p.getIdproveedor());
		obj.setEstado(false);
		return repository.save(obj);
	}
	
	

}
