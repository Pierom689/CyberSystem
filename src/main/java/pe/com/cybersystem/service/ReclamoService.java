package pe.com.cybersystem.service;

import java.util.List;
import java.util.Optional;

import pe.com.cybersystem.entity.ReclamoEntity;

public interface ReclamoService {

	public List<ReclamoEntity> findAll();
	
	public List<ReclamoEntity> findAllCustom();
	
	public Optional<ReclamoEntity> findById(long id);
	
	public ReclamoEntity add(ReclamoEntity r);
	
	public ReclamoEntity update(ReclamoEntity r);
	
	public ReclamoEntity delete(ReclamoEntity r);
}
