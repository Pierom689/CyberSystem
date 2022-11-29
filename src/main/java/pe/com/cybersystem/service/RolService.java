package pe.com.cybersystem.service;

import java.util.List;
import java.util.Optional;

import pe.com.cybersystem.entity.RolEntity;


public interface RolService {
	public List<RolEntity> findAll();
	public List<RolEntity> findAllCustom();
	public Optional<RolEntity> findById(long id);
	public RolEntity add(RolEntity r);
	public RolEntity update(RolEntity r);
	public RolEntity delete(RolEntity r);
}
