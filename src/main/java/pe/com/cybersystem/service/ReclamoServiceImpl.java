package pe.com.cybersystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.cybersystem.entity.ReclamoEntity;
import pe.com.cybersystem.repository.ReclamoRepository;


@Service
public class ReclamoServiceImpl implements ReclamoService{

	
	@Autowired
	private ReclamoRepository repository;
	
	@Override
	public List<ReclamoEntity> findAll() {
		return repository.findAll();
	}

	@Override
	public List<ReclamoEntity> findAllCustom() {
		return repository.findAllCustom();
	}

	@Override
	public Optional<ReclamoEntity> findById(long id) {
		return repository.findById(id);
	}

	@Override
	public ReclamoEntity add(ReclamoEntity r) {
		return repository.save(r);
	}

	@Override
	public ReclamoEntity update(ReclamoEntity r) {
		ReclamoEntity objreclamo = repository.getById(r.getIdreclamo());
		BeanUtils.copyProperties(r, objreclamo);
		return repository.save(objreclamo);
	}

	@Override
	public ReclamoEntity delete(ReclamoEntity r) {
		ReclamoEntity objreclamo = repository.getById(r.getIdreclamo());
		objreclamo.setEstado(false);
		return repository.save(objreclamo);
	}

	
}
