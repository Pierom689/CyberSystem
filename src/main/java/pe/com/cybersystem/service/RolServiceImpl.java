package pe.com.cybersystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.cybersystem.entity.RolEntity;
import pe.com.cybersystem.repository.RolRepository;



@Service
public class RolServiceImpl implements RolService {
	@Autowired
	private RolRepository repositorio;
	

	@Override
	public List<RolEntity> findAll() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public List<RolEntity> findAllCustom() {
		// TODO Auto-generated method stub
		return repositorio.findAllCustom();
	}

	@Override
	public Optional<RolEntity> findById(long id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id);
	}

	@Override
	public RolEntity add(RolEntity r) {
		// TODO Auto-generated method stub
		return repositorio.save(r);
	}

	@Override
	public RolEntity update(RolEntity r) {
		// TODO Auto-generated method stub
		RolEntity objrol=repositorio.getById(r.getCodigo());
		BeanUtils.copyProperties(r, objrol);
		return repositorio.save(objrol);
	}

	@Override
	public RolEntity delete(RolEntity r) {
		// TODO Auto-generated method stub
		RolEntity objrol=repositorio.getById(r.getCodigo());
		objrol.setEstado(false);
		return repositorio.save(objrol); 
	}

}
