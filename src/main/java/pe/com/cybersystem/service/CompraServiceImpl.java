package pe.com.cybersystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import pe.com.cybersystem.entity.CompraEntity;
import pe.com.cybersystem.repository.CompraRepository;
@Service
public class CompraServiceImpl implements CompraService {

	@Autowired
	private CompraRepository repository;
	
	@Override
	public List<CompraEntity> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<CompraEntity> findAllCustom() {
		// TODO Auto-generated method stub
		return repository.findAllCustom();
	}

	@Override
	public Optional<CompraEntity> findById(long id) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public CompraEntity add(CompraEntity co) {
		// TODO Auto-generated method stub
		return repository.save(co);
	}


	@Override
	public CompraEntity update(CompraEntity co) {
		// TODO Auto-generated method stub
		CompraEntity obj =  repository.getById(co.getIdcompra());
		BeanUtils.copyProperties(co, obj);
	    return repository.save(obj);
	}

	@Override
	public CompraEntity delete(CompraEntity co) {
		// TODO Auto-generated method stub
		CompraEntity obj =  repository.getById(co.getIdcompra());
		obj.setEstado(false);
        return repository.save(obj);
	}

}
