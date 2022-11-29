package pe.com.cybersystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.cybersystem.entity.DetalleVentaEntity;
import pe.com.cybersystem.repository.DetalleVentaRepository;

@Service
public class DetalleVentaServiceImpl implements DetalleVentaService {
	
	@Autowired
	private DetalleVentaRepository repository;

	@Override
	public List<DetalleVentaEntity> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<DetalleVentaEntity> findById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public DetalleVentaEntity add(DetalleVentaEntity d) {
		// TODO Auto-generated method stub
		return repository.save(d);
	}
}
