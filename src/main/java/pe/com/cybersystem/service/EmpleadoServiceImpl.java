package pe.com.cybersystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.cybersystem.entity.EmpleadoEntity;
import pe.com.cybersystem.repository.EmpleadoRepository;


@Service
public class EmpleadoServiceImpl implements EmpleadoService {
	@Autowired
	private EmpleadoRepository repositorio;

	@Override
	public List<EmpleadoEntity> findAll() {
		// TODO Auto-generated method stub
		return repositorio.findAll();	}

	@Override
	public List<EmpleadoEntity> findAllCustom() {
		// TODO Auto-generated method stub
		return repositorio.findAllCustom();
	}

	@Override
	public Optional<EmpleadoEntity> findById(long id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id);
	}

	@Override
	public EmpleadoEntity add(EmpleadoEntity e) {
		// TODO Auto-generated method stub
		return repositorio.save(e);
	}

	@Override
	public EmpleadoEntity update(EmpleadoEntity e) {
		// TODO Auto-generated method stub
		EmpleadoEntity objempleado=repositorio.getById(e.getCodigo());
		BeanUtils.copyProperties(e, objempleado);
		return repositorio.save(objempleado);	}

	@Override
	public EmpleadoEntity delete(EmpleadoEntity e) {
		// TODO Auto-generated method stub
		EmpleadoEntity objempleado=repositorio.getById(e.getCodigo());
		objempleado.setEstado(false);
		return repositorio.save(objempleado); 
	}

}
