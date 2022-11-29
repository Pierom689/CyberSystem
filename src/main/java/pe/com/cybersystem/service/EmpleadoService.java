package pe.com.cybersystem.service;

import java.util.List;
import java.util.Optional;

import pe.com.cybersystem.entity.EmpleadoEntity;



public interface EmpleadoService {
	public List<EmpleadoEntity> findAll();
	public List<EmpleadoEntity> findAllCustom();
	public Optional<EmpleadoEntity> findById(long id);
	public EmpleadoEntity add(EmpleadoEntity e);
	public EmpleadoEntity update(EmpleadoEntity e);
	public EmpleadoEntity delete(EmpleadoEntity e);
}
