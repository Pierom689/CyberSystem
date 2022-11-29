package pe.com.cybersystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.cybersystem.entity.CategoriaEntity;
import pe.com.cybersystem.repository.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired 
	private CategoriaRepository repository;
	
	@Override
	public List<CategoriaEntity> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<CategoriaEntity> findAllCustom() {
		// TODO Auto-generated method stub
		return repository.findAllCustom();
	}

	@Override
	public Optional<CategoriaEntity> findById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public CategoriaEntity add(CategoriaEntity c) {
		// TODO Auto-generated method stub
		return repository.save(c);
	}

	@Override
	public CategoriaEntity update(CategoriaEntity c) {
		// TODO Auto-generated method stub
		CategoriaEntity obj = repository.getById(c.getIdcat());
        BeanUtils.copyProperties(c, obj);
        return repository.save(obj);
	}

	@Override
	public CategoriaEntity delete(CategoriaEntity c) {
		// TODO Auto-generated method stub
		CategoriaEntity obj = repository.getById(c.getIdcat());
		obj.setEstadocat(false);
        return repository.save(obj);
	}

}
